# Only this variables we can modify
#daily


echo `date`
WORKING_DIR=/sendemail
cd $WORKING_DIR
export LANG=zh_CN.utf-8
process=`ps -ef|grep java`
#echo $process
bb=`echo $process|grep 'SendEmail2'|wc -l`
if [ $bb = 0 ]
then
   echo "starting send email!"
   postsuper -d ALL
   java -Xss256k -Xmx100m -Xms100m -XX:NewRatio=4 -Dlog4j.configuration=file:log4j.properties -Dneed_sender=N -Dmachine_name=xuxim-office-22 -Ddelay_time=4000 -classpath .:./lib/*:send-mail-1.0-SNAPSHOT.jar com.mail.utils.SendEmail2 1>./stdout 2>./stderr &
else
   echo "sendemail2 already started"
fi
