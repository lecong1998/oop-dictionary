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
 ��y l� t? di?n Anh-Vi?t
Nh�m th�nh vi�n g?m :
-L� Van C�ng
-�?ng Qu?c d?i

Qu� tr�nh l�m c� tham kh?o ngu?n co s? d? li?u t? https://shimivn.blogspot.com/2016/03/share-database-tu-ien-anh-viet.html

ch?y file tudienAnh-Viet.jar -> s? xu?t hi?n m�n h�nh giao di?n .  �? tra t? b?n nh?p t? c?n tra v�o m?c tra t? -> r?i ch?n n�t tra t? ngay b�n ph?i 
K?t qu? hi?n th? s? ? ngay b�n du?i .

-T? di?n du?c ph�t tri?n d?a tr�n database, do d� v?n c�n thi?u ho?c sai s�t  n�n v?i nh?ng ngu?i ph�t tri?n c� th? th�m - S?a - X�a t? tr�n database d� 
�? th?c hi?n nh?ng di?u n�y ta ph?i dang nh?p quy?n admin , n�t dang nh?p ngay g�c ph?i c?a giao di?n . sau khi click v�o n�t dang nh?p , 1 form dang nh?p s? du?c hi?n ra
-t�n dang nh?p : admin
-password: tudien .
sau khi dang nh?p th�nh c�ng s? c� 1 form t�c v? hi?n ra, th?c hi?n c�c t�c v? th�m - s?a -x�a tr�n form d�