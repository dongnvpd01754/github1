-- TẠO CSDL QUẢN LÝ QUAN LY BAN HANG
CREATE DATABASE QLBANHANG;
go
USE QLBANHANG;
go
-- TẠO BẢNG SAN PHAM 
CREATE TABLE SANPHAM
(
maSP CHAR(60) NOT NULL,
tenSP VARCHAR(70) NOT NULL,
mota nvarchar(30) NOT NULL,
soluong int NOT NULL,
dongia MONEY NOT NULL,
nhasanxuat varchar(255) NOT NULL,
maloai nvarchar(30) NOT NULL
PRIMARY KEY (maSP)
);
-- tạo bảng tài khoản 
CREATE TABLE TAIKHOAN
(
tendangnhap VARCHAR(30) NOT NULL,
matkhau VARCHAR(30) NOT NULL,
vaitro VARCHAR(30) NOT NULL,
hoten VARCHAR(50) NOT NULL,
diachi VARCHAR(50) NOT NULL,
soDT VARCHAR(11) NOT NULL,
email VARCHAR(30) NOT NULL,
PRIMARY KEY (tendangnhap)
);
-- TẠO BẢNG ĐƠN HÀNG CHI TIẾT
CREATE TABLE DONHANGCHITIET
(
madonhangCT int NOT NULL,
madonhang int NOT NULL,
maSp int NOT NULL,
soluong int NOT NULL,
giaban int NOT NULL,
PRIMARY KEY (madonhangCT)
);
-- TẠO BẢNG LOẠI SẢN PHẨM .
CREATE TABLE LOAISP
(
maloai char(6) NOT NULL,
tenloai varchar(60) NOT NULL,
PRIMARY KEY (maloai)
);
--TẠO BẢNG ĐƠN HÀNG
CREATE TABLE DONHANG
(
madonhang VARCHAR(30) NOT NULL,
makhachhang VARCHAR(30) NOT NULL,
ngaydat VARCHAR(30) NOT NULL,
trangthai VARCHAR(30) NOT NULL,
PRIMARY KEY (madonhang)
);
-- nhập thông tin vào bảng tài khoản 
INSERT TAIKHOAN VALUES('admin',123,'admin',N'Nguyễn Văn Đồng',N'Nghệ An',01689162259,'dongnvpd01754@fpt.edu.vn');
INSERT TAIKHOAN VALUES('khachhang1',123 ,'Khach hang',N'Thái Phương Điên',N'Quảng Nôn',01689132259,'dongnvpd01754@fpt.edu.vn');

SELECT * FROM TAIKHOAN

SELECT * FROM DONHANG
