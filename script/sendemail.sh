# Only this variables we can modify
#daily


echo `date`
WORKING_DIR=/sendemail
cd $WORKING_DIR
export LANG=zh_CN.utf-8
process=`ps -ef|grep java`
#echo $process
bb=`echo $process|grep 'SendEmail'|wc -l`
if [ $bb = 0 ]
then
   echo "starting send email!"
   java -Xss256k -Xmx4096m -Xms4096m -XX:NewRatio=4 -XX:PermSize=96m -XX:MaxPermSize=96m -Dlog4j.configuration=file:log4j.properties -Dmachine_name=xuxim-office-22 -Ddelay_time=4000 -classpath .:./lib/*:send-mail-1.0-SNAPSHOT.jar com.mail.utils.SendEmail 1>./stdout 2>./stderr &
else
   echo "sendemail already started"
fi
