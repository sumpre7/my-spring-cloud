#### git一直提示连接超时的处理方式

进入项目目录 ，取消代理设置

 ``` git config --global --unset http.proxy ``` 
 
 ```  git config --global --unset https.proxy ``` 

部署成功后，访问方式：
1. http://localhost:8099/main/application-dev.properties
2. http://localhost:8099/application/dev/main