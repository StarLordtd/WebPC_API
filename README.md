in mysql create project with password is "123456" then open new query and paste this code:
CREATE DATABASE IF NOT EXISTS product;

USE product;

CREATE TABLE IF NOT EXISTS products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(200) NOT NULL,
    image VARCHAR(200) NOT NULL,
    price VARCHAR(45) NOT NULL,
    detail TEXT NOT NULL
);



then new query and paste data products:
INSERT INTO product.products VALUES 
(1, 'PC Gaming - Glacier I3050 - 01BL', 'https://www.tncstore.vn/media/product/250-8687-tnc-store-pc-gaming-glacier-i3050-01bl-69.jpg', 526, '- CPU: Intel Core i3-12100F 4C/8T (3.3 Ghz up to 4.3GHz, 12MB, LGA1700, Alder Lake)_Tray\n- Main: Asus PRIME H610M-K D4\n- RAM: HIKSEMI ARMOR DDR4-8GB 3200MHZ U10 U-DIMM\n- SSD: Ổ cứng SSD Hiksemi Future Eco 512G PCIe Gen 4x4 NVMe\n- VGA: Asus Dual RTX 3050 8GB V2\n- PSU: KENOO E550c - Mầu Đen - Cáp dẹt\n- Vỏ case: KENOO ESPORT MK500-3F Black');
INSERT INTO product.products VALUES 
(2, 'PC Gaming - Sniper I4070Ti - Silver', 'https://www.tncstore.vn/media/product/250-8768-sniper-i4070ti---silver-1.jpg', 2000, 'CPU: Intel Core i5 - 14500 14C/20T ( Up to 4.80GHz, 24MB )\n- Mainboard: ASUS ROG STRIX B760-I GAMING WIFI DDR5\n- RAM : Corsair VENGEANCE RGB 32GB (2x16GB) 5600MHz Black (CMH32GX5M2B5600C40K)\n- SSD: Kingston KC3000 1TB NVMe PCIe Gen 4.0\n- VGA: ASUS TUF Gaming GeForce RTX 4070 Ti SUPER 16GB GDDR6X\n- PSU: Lian Li SP850 850W SFX Black\n- Vỏ case: Lian-Li A4 H2O Silver\n- Tản nhiệt: Tản Nhiệt Nước CPU MSI MAG CORELIQUID C240 (Tặng kèm theo cấu hình)');
INSERT INTO product.products VALUES 
(3, 'PC Gaming - Nova A4070 - BL', 'https://www.tncstore.vn/media/product/250-8558-nova-a4070---bl.jpg', 1800, 'CPU: AMD Ryzen 5 7600X (4.7GHz Upto 5.3GHz / 32MB / 6 Cores, 12 Threads )\n- Mainboard: Asus TUF GAMING B650M-PLUS DDR5\n- SSD: AORUS 5000E 1TB PCIe Gen 4 x4 NVMe M.2\n- RAM: G SKILL Trident Z5 RGB Black - 32GB(16GBx2) DDR5 5600Mhz F5-5600J4040C16GX2-TZ5RK\n- VGA: Asus TUF Gaming GeForce RTX 4070 SUPER 12GB GDDR6X\n- PSU: NZXT C750 750W 80 Plus Bronze\n- Vỏ case: Corsair 4000D Airflow TG Black');
INSERT INTO product.products VALUES 
(4, 'PC Gaming - Sentinel i4070Ti - BL', 'https://www.tncstore.vn/media/product/250-8158-sentinel-i4070ti---bl.jpg', 2500, 'CPU: Intel Core i7 14700K (33MB Cache, up to 5.6 GHz, 20C28T, socket 1700)_NK\n- Mainboard: ASUS ROG STRIX Z790-F GAMING WIFI II\n- RAM: Corsair VENGEANCE RGB 32GB (2x16GB) 5600MHz Black\n- SSD: AORUS 5000E 1TB PCIe Gen 4 x4 NVMe M.2\n- VGA: ASUS ROG Strix GeForce RTX 4070 Ti SUPER 16GB OC GDDR6X\n- PSU: Corsair RM850e ATX 3.0 80 Plus Gold - Full Modul\n- Vỏ case: Corsair 4000D Airflow TG Black');
INSERT INTO product.products VALUES 
(5, 'PC Gaming - Glacier I1660 Super - WH', 'https://www.tncstore.vn/media/product/250-7899-pc-gaming-glacier-i1660-super---wh.jpg', 500, 'CPU: Intel Core I3 13100F 4C/8T (3.4Ghz up to 4.50GHz, 12MB )\n- Mainboard: Bo mạch chủ Asus PRIME H610M-K D4\n- RAM: RAM Kingston Fury Beast 8GB Bus 3200 MHz (KF432C16BB/8)\n- SSD: Ổ cứng SSD Hiksemi Future Eco 512G PCIe Gen 4x4 NVMe\n- VGA: Asus TUF GTX 1660 Super OC 6GB GDDR6\n- PSU: Nguồn máy tính KENOO E550c\n- Vỏ case: Vỏ Case KENOO ESPORT M500-3F White');
INSERT INTO product.products VALUES 
(6, 'TNC PC STUDIO STARTER 02I', 'https://www.tncstore.vn/media/product/250-9173-250-8460-glacier-i1650---bl--100-.jpg', 400, 'CPU: Intel Core i3 - 10105F 4C/8T ( 3.7GHz up to 4.4GHz, 6MB )\n- Mainboard: Asus Prime H510M-K R2.0\n- RAM: HIKSEMI ARMOR DDR4-8GB 3200MHZ U10 U-DIMM\n- SSD: SSD Hiksemi Wave 512GB Sata 3\n- VGA: ASUS Dual GeForce GTX 1650 OC Edition Evo 4GB GDDR6\n- PSU: KENOO E550c - Mầu Đen - Cáp dẹt\n- Vỏ case: KENOO ESPORT MK500-3F Black');
INSERT INTO product.products VALUES 
(7, 'PC STUDIO BEGINNER 04I', 'https://www.tncstore.vn/media/product/250-9179-250-7790-sniper-i3060---wh-1.jpg', 700, 'CPU: Intel Core i5-12400F 6C/12T (Up To 4.40GHz, 18MB, Socket 1700, Alder Lake) Hàng Tray\nMain: Bo Mạch Chủ Asus Prime B760M-K D4\nRAM: Adata XPG D50 DDR4 RGB 8GB 3200Mhz - White\nSSD: Ổ cứng SSD Hiksemi Future Eco 512G PCIe Gen 4x4 NVMe\nVGA: GIGABYTE Geforce RTX 3060 Vision OC 12G V2\nPSU: Nguồn Antec CSK550 550W 80 Plus Bronze\nVỏ case: Vỏ Case XIGMATEK LUX A ARCTIC');
INSERT INTO product.products VALUES 
(8, 'PC STUDIO BEGINNER 05I', 'https://www.tncstore.vn/media/product/250-9181-250-7762-sniper-i3050---bl-9999.jpg', 600, 'CPU: Intel Core i5-12400F 6C/12T (Up To 4.40GHz, 18MB, Socket 1700, Alder Lake) Hàng Tray\nMain: MSI PRO B660M-A WIFI DDR4\nRAM: Kingston Fury Beast 8GB Bus 3200 MHz (x2)\nSSD: Hiksemi Future Eco 512G PCIe Gen 4x4 NVMe\nVGA: Asus Dual GeForce RTX 3050 OC Edition 6GB GDDR6\nPSU: Antec CSK550 550W 80 Plus Bronze\nVỏ case: KENOO ESPORT MK500-3F Black');
INSERT INTO product.products VALUES 
(9, 'PC STUDIO JUNIOR 03I', 'https://www.tncstore.vn/media/product/250-9170-250-8618-nova-i4070---wh-1.jpg', 2000, 'CPU : Intel Core i7 14700K (33MB Cache, up to 5.6 GHz, 20C28T, socket 1700)_NK\n- Mainboard : ASUS ROG STRIX B760-A GAMING WIFI DDR5\n- SSD : Samsung 980 PRO 1TB M.2 NVMe PCIe Gen 4.0 x4\n- RAM : Corsair Dominator Platinum RGB 32GB (2x16GB) 5600Mhz White\n- VGA : Card Màn Hình Gigabyte GeForce RTX 4070 Aero OC 12GB\n- Nguồn : MSI MAG A750BN 750W - 80 Plus Bronze\n- Vỏ case: LIAN-LI O11D EVO White\n- Tản nhiệt: AIO Asus ROG Strix LC II 360 ARGB White ( tặng kèm )');
INSERT INTO product.products VALUES 
(10, 'PC STUDIO PRO 06I LIMITED', 'https://www.tncstore.vn/media/product/250-9183-sentinal-i4080-eva-02-limited-edition.jpg', 5200, 'Vỏ case Asus ROG Hyperion GR701 EVA\n- Bo Mạch Chủ Asus ROG MAXIMUS Z790 HERO EVA 02 DDR5\n- Tản nhiệt nước ASUS ROG RYUJIN III 360 ARGB EVA-02 EDITION\n- Nguồn Asus ROG Thor 1000W - 80 Plus Platinum II Eva Edition\n- Card Màn Hình Asus ROG Strix RTX® 4090 OC EVA 02 Edition 24GB\n- RAM Corsair Dominator Platinum RGB 32GB (2x16GB) 5600Mhz (CMT32GX5M2B5600C36) x2\n- Ổ cứng SSD Samsung 990 PRO 2TB M.2 NVMe PCIe Gen 4.0 x4');
INSERT INTO product.products VALUES 
(11, 'PC STUDIO SENIOR 01I', 'https://www.tncstore.vn/media/product/250-9176-sentinel-i4070ti---bl.jpg', 2600, 'CPU: Intel Core i7 14700K (33MB Cache, up to 5.6 GHz, 20C28T, socket 1700)_NK\n- Mainboard: ASUS ROG STRIX Z790-F GAMING WIFI II\n- RAM: Corsair VENGEANCE RGB 32GB (2x16GB) 5600MHz Black\n- SSD: AORUS 5000E 1TB PCIe Gen 4 x4 NVMe M.2\n- VGA: ASUS ROG Strix GeForce RTX 4070 Ti SUPER 16GB OC GDDR6X\n- PSU: Corsair RM850e ATX 3.0 80 Plus Gold - Full Modul\n- Vỏ case: Corsair 4000D Airflow TG Black');
INSERT INTO product.products VALUES 
(12, 'PC Doanh Nghiệp Full Combo 1', 'https://www.tncstore.vn/media/product/250-9237-p1--2-.jpg', 400, 'CPU: AMD Ryzen™ 5 4600G (8M Cache, Up to 4.2GHz, 6C12T, Socket AM4)\n- Mainboard: ASUS Prime A320M-K\n- SSD: SSD Hiksemi Wave 512GB Sata 3\n- RAM: HIKSEMI ARMOR DDR4-8GB 3200MHZ U10 U-DIMM\n- Nguồn: Nguồn máy tính KENOO E550c - Mầu Đen - Cáp dẹt\n- Vỏ case: MIK TM06 - Black\n- Màn hình: ASUS VA24EHF 23.8 inch/ IPS/ Full HD/ 100Hz/ 1ms');
