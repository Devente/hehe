jdk8环境变量配置教程
1、下载软件压缩包文件，点击你电脑系统向对应的程序“jdk-8u144-windows-x64.exe（64位）或者jdk-8u144-windows-i586.exe（32位）”。

2、程序会自动安装JRE程序，选择目录即可

3、直到jdk8下载安装完毕，点击“关闭”按钮即可，如下图所示：

4、安装完JDK后配置环境变量，计算机→属性→高级系统设置→高级→环境变量

5、系统变量→新建 JAVA_HOME 变量
变量值填写jdk的安装目录（本人是 C:\Program Files\Java\jdk1.8.0_144)

6、系统变量→寻找 Path 变量→编辑
在变量值最后输入 %JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;
（注意原来Path的变量值末尾有没有;号，如果没有，先输入；号再输入上面的代码）

8、检验是否配置成功 运行cmd 输入 java -version （java 和 -version 之间有空格）若如图所示 显示版本信息 则说明安装和配置成功。
9、在 cmd 输入 set 查看Path值是否正确
