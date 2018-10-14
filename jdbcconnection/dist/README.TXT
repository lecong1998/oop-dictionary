========================
BUILD OUTPUT DESCRIPTION
========================

When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line, go to the dist folder and
type the following:

java -jar "jdbcconnection.jar" 

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.

Notes:

* If two JAR files on the project classpath have the same name, only the first
JAR file is copied to the lib folder.
* Only JAR files are copied to the lib folder.
If the classpath contains other types of files or folders, these files (folders)
are not copied.
* If a library on the projects classpath also has a Class-Path element
specified in the manifest,the content of the Class-Path element has to be on
the projects runtime path.
* To set a main class in a standard Java project, right-click the project node
in the Projects window and choose Properties. Then click Run and enter the
class name in the Main Class field. Alternatively, you can manually type the
class name in the manifest Main-Class element.
 Ðây là t? di?n Anh-Vi?t
Nhóm thành viên g?m :
-Lê Van Công
-Ð?ng Qu?c d?i

Quá trình làm có tham kh?o ngu?n co s? d? li?u t? https://shimivn.blogspot.com/2016/03/share-database-tu-ien-anh-viet.html

ch?y file tudienAnh-Viet.jar -> s? xu?t hi?n màn hình giao di?n .  Ð? tra t? b?n nh?p t? c?n tra vào m?c tra t? -> r?i ch?n nút tra t? ngay bên ph?i 
K?t qu? hi?n th? s? ? ngay bên du?i .

-T? di?n du?c phát tri?n d?a trên database, do dó v?n còn thi?u ho?c sai sót  nên v?i nh?ng ngu?i phát tri?n có th? thêm - S?a - Xóa t? trên database dó 
Ð? th?c hi?n nh?ng di?u này ta ph?i dang nh?p quy?n admin , nút dang nh?p ngay góc ph?i c?a giao di?n . sau khi click vào nút dang nh?p , 1 form dang nh?p s? du?c hi?n ra
-tên dang nh?p : admin
-password: tudien .
sau khi dang nh?p thành công s? có 1 form tác v? hi?n ra, th?c hi?n các tác v? thêm - s?a -xóa trên form dó