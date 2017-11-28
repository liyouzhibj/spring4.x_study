# 资料
## 书
1. 精通Spring 4.x  企业应用开发实战
2. 
## 源码
1. http://pan.baidu.com/s/1boC13d1
2. 

# 快速入门
## Maven安装
1. http://maven.apache.org/download.cgi 下载安装包
2. tar -xvf apache-maven-3.5.2-bin.tar.gz 解压缩安装包
3. 添加环境变量
MAVEN_HOME=/usr/local/src/apache-maven-3.5.2  
export MAVEN_HOME  
export PATH=${PATH}:${MAVEN_HOME}/bin  
4. source /etc/profile 使环境变量生效
5. <localRepository> 配置本地仓库
6. <mirror> 配置镜像
7. 
## Maven使用
1. mvn archetype:generate -DgroupId=helloworld -DartifactId=helloworld 创建helloworld项目
2. mvn package 打包
3. mvn 常用命令  
mvn compile 编译项目，这个命令用于编译Maven工程，执行命令后会在target文件夹中的classes中生成对应的class文件。   
mvn test  编译运行单元测试，先自动进行编译，在运行所有的测试用例。  
mvn package 打包(jar or war)  
mvn install 将项目安装到本地仓库，发布生成对应的package包。  
mvn clean 清空项目，删除target文件夹，即删除生成的package包以及class等文件。  
mvn eclipse:eclipse 生成eclipse工程  