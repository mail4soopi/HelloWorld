export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64/
export CLASSPATH=/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/:/home/app/$OO_LOCAL{appName}/releases/$OO_LOCAL{version}/BOOT-INF/lib/:/home/app/HelloWorld/releases/$OO_LOCAL{version}/
cd /home/app/$OO_LOCAL{appName}/releases/$OO_LOCAL{version}/BOOT-INF/
chmod -R 777 lib
sudo chown app:app /var/log

pkill java
cd /home/app/$OO_LOCAL{appName}/releases/
chmod -R 777 /app/$OO_LOCAL{appName}/releases/$OO_LOCAL{version}/
cd /home/app/$OO_LOCAL{appName}/releases/$OO_LOCAL{version}/

fname="helloworld.log"
nohup java -Dspring.profiles.active=$OO_LOCAL{envname} org.springframework.boot.loader.JarLauncher >> /var/log/$fname &
