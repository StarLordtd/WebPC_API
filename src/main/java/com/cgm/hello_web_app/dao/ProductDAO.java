package com.cgm.hello_web_app.dao;

import java.sql.Connection;
import java.sql.Statement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cgm.hello_web_app.eitities.Product;

public class ProductDAO {
	public ArrayList<Product> getLatestProductList() {
		// code
		String url, user, password;
		Connection conn = null;
		String sql = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ArrayList<Product> list= null;

		try {
			// connect to DB
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create a connection
			url = "jdbc:mysql://localhost:3306/product";
			user = "root";
			password = "123456";
			conn = DriverManager.getConnection(url, user, password);
			//System.out.println(conn);
			
			sql = "select * from products";
			//create a prepare statement
			pst = conn.prepareStatement(sql);
			
			//execute query
			rs = pst.executeQuery();
			list= new ArrayList<Product>();
			while (rs.next()) {
	            // Lấy thông tin từ ResultSet và tạo đối tượng Product
	            int id = rs.getInt("id");
	            String name = rs.getString("name");
	            double price = rs.getDouble("price");
	            String image = rs.getString("image");
	            String detail = rs.getString("detail");
	            Product product = new Product(id, image, name, price, detail);
	            // Thêm sản phẩm vào danh sách
	            list.add(product);
	        }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//get product from table product ò dtb product
		catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pst.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;
	}
	
	
	
	
	public int addProduct(Product product) {
	    String url, user, password;
	    Connection conn = null;
	    String sql = null;
	    PreparedStatement pst = null;
	    ResultSet rs = null;
	    int generatedId = -1; // Mặc định giá trị trả về nếu không có ID được tạo

	    try {
	        // Connect to the database
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        url = "jdbc:mysql://localhost:3306/product";
	        user = "root";
	        password = "123456";
	        conn = DriverManager.getConnection(url, user, password);

	        // SQL statement to insert product
	        sql = "INSERT INTO products (name, price, image, detail) VALUES (?, ?, ?, ?)";
	        pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	        pst.setString(1, product.getName());
	        pst.setDouble(2, product.getPrice());
	        pst.setString(3, product.getImage());
	        pst.setString(4, product.getDetail());

	        // Execute the SQL statement
	        int affectedRows = pst.executeUpdate();
	        if (affectedRows == 0) {
	            throw new SQLException("Creating product failed, no rows affected.");
	        }

	        // Get the generated ID from the database
	        rs = pst.getGeneratedKeys();
	        if (rs.next()) {
	            generatedId = rs.getInt(1); // Get the automatically generated ID from the database
	        }
	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace(); // Handle exceptions
	    } finally {
	        // Close connections and resources
	        try {
	            if (rs != null) rs.close();
	            if (pst != null) pst.close();
	            if (conn != null) conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return generatedId; // Return the ID of the newly added product
	}

	
	
	

	public boolean updateProduct(Product product) {
	    String url, user, password;
	    Connection conn = null;
	    String sql = null;
	    PreparedStatement pst = null;

	    try {
	        // Connect to DB
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        url = "jdbc:mysql://localhost:3306/product";
	        user = "root";
	        password = "123456";
	        conn = DriverManager.getConnection(url, user, password);

	        sql = "UPDATE products SET name=?, price=?, image=? WHERE id=?";
	        pst = conn.prepareStatement(sql);
	        pst.setString(1, product.getName());
	        pst.setDouble(2, product.getPrice());
	        pst.setString(3, product.getImage());
	        pst.setInt(4, product.getId());

	        int rowsUpdated = pst.executeUpdate();
	        return rowsUpdated > 0; // Trả về true nếu có ít nhất một dòng được cập nhật
	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	        return false; // Trả về false nếu có lỗi xảy ra
	    } finally {
	        try {
	            if (pst != null) pst.close();
	            if (conn != null) conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

	
	public boolean deleteProduct(int productId) {
	    String url, user, password;
	    Connection conn = null;
	    String sql = null;
	    PreparedStatement pst = null;

	    try {
	        // Connect to DB
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        url = "jdbc:mysql://localhost:3306/product";
	        user = "root";
	        password = "123456";
	        conn = DriverManager.getConnection(url, user, password);

	        sql = "DELETE FROM products WHERE id=?";
	        pst = conn.prepareStatement(sql);
	        pst.setInt(1, productId);

	        int rowsDeleted = pst.executeUpdate();
	        return rowsDeleted > 0; // Trả về true nếu có ít nhất một dòng bị xóa
	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	        return false; // Trả về false nếu có lỗi xảy ra
	    } finally {
	        try {
	            if (pst != null) pst.close();
	            if (conn != null) conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}



	// Trong lớp ProductDAO
	public Product getProductById(int id) {
	    Product product = null;
	    String url, user, password;
	    Connection conn = null;
	    String sql = null;
	    PreparedStatement pst = null;
	    ResultSet rs = null;

	    try {
	        // Kết nối đến cơ sở dữ liệu
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        url = "jdbc:mysql://localhost:3306/product";
	        user = "root";
	        password = "123456";
	        conn = DriverManager.getConnection(url, user, password);

	        sql = "SELECT * FROM products WHERE id=?";
	        pst = conn.prepareStatement(sql);
	        pst.setInt(1, id);
	        rs = pst.executeQuery();

	        // Nếu có sản phẩm với ID tương ứng, tạo một đối tượng Product
	        if (rs.next()) {
	            int productId = rs.getInt("id");
	            String name = rs.getString("name");
	            double price = rs.getDouble("price");
	            String image = rs.getString("image");
	            String detail = rs.getString("detail");
	            product = new Product(productId, image, name, price, detail);
	        }
	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            if (pst != null) pst.close();
	            if (conn != null) conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return product;
	}

	
	public static void main(String[] args) {
		ProductDAO productDAO = new ProductDAO();
		productDAO.getLatestProductList();
	}

}


