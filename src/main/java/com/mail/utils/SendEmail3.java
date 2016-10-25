package com.mail.utils;

import com.mail.entity.Mail;
import com.mail.utils.EmailUtils;

import java.sql.SQLException;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;

public class SendEmail3{
	public static void main( String[] args ) throws SQLException, EmailException{
		sendEmailToOther();
	}
	
	
    public static void sendEmailToOther() throws EmailException{
        Mail mail = new Mail();
        mail.setHost("smtp.qq.com"); // 设置邮件服务器,如果不用163的,自己找找看相关的
        mail.setSender("yangmao9201@qq.com");
        //mail.setReceiver("15301392163@163.com"); // 接收人
        mail.setReceiver("ximingxu99@163.com"); // 接收人
        mail.setUsername("yangmao9201@qq.com"); // 登录账号,一般都是和邮箱名一样吧
        mail.setPassword("maoyang_9201"); // 发件人邮箱的登录密码
        mail.setName("羊毛情报站");
        mail.setSubject("ceshi");
        mail.setMessage("<div align=\"center\" style=\"text-align:center;background-color:white;\"><span style=\"background-color:white;\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;text-align:justify;padding:0;border-bottom:2px solid #CECECE;\">\n" +
                "<tbody><tr>\n" +
                "<td colspan=\"2\" style=\"height:15px;padding:0;\">&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr style=\"padding:0;border-width:0;\">\n" +
                "<td width=\"149\" align=\"center\" valign=\"top\" style=\"width:149px;text-align:center;padding:0;\">\n" +
                "<a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=f097a34525&amp;e=1ba327495b\" target=\"_blank\"><font size=\"2\" color=\"#669510\"><span style=\"font-size:14px;\"><b><img blockedimagesrc=\"https://d3rqdbvvokrlbl.cloudfront.net/images/email/daily-digest/logo.png\" width=\"149\" height=\"41\" alt=\"Woot\">\n" +
                "<br>\n" +
                "\n" +
                "Shop 443 new deals </b></span></font></a></td>\n" +
                "<td>&nbsp;</td>\n" +
                "<td width=\"300\" valign=\"bottom\" style=\"width:300px;padding:0;\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table width=\"310\" style=\"border-collapse:collapse;width:310px;padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td align=\"right\" valign=\"middle\" style=\"\"><a href=\"http://woot.us1.list-manage1.com/unsubscribe?u=e6217fba00b9cdcae52e4e72e&amp;id=c5ca76da11&amp;e=1ba327495b&amp;c=8bda0ebbf0\" target=\"_blank\"><font color=\"#669510\"><span style=\"display:block;\"><font size=\"1\"><span style=\"font-size:13px;\">Daily\n" +
                "emails? Are you nuts?</span></font> <br>\n" +
                "\n" +
                "<font size=\"2\"><span style=\"font-size:14px;\"><b>Stop sending me emails!</b></span></font> </span></font></a></td>\n" +
                "<td width=\"46\" valign=\"middle\" style=\"width:46px;padding-left:10px;\"><a href=\"http://woot.us1.list-manage1.com/unsubscribe?u=e6217fba00b9cdcae52e4e72e&amp;id=c5ca76da11&amp;e=1ba327495b&amp;c=8bda0ebbf0\" target=\"_blank\"><img blockedimagesrc=\"https://d3rqdbvvokrlbl.cloudfront.net/images/email/daily-digest/monte.png\" width=\"46\" height=\"43\">\n" +
                "</a></td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" style=\"height:10px;padding:0;\">&nbsp;</td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;text-align:justify;padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td colspan=\"2\" style=\"height:20px;padding:0;\">&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr style=\"padding:0;border-width:0;\">\n" +
                "<td width=\"252\" valign=\"top\" style=\"width:252px;padding:0;\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td style=\"padding:0;\">\n" +
                "<div style=\"padding:0;\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\" size=\"4\" color=\"black\"><span style=\"font-size:24px;font-weight:normal;\"><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=9bd9ce79f6&amp;e=1ba327495b\" target=\"_blank\">Lenovo\n" +
                "Yoga 12\" Intel i7 Touch Ultrabook</a> </span></font></div>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"padding:0;\">\n" +
                "<div style=\"padding:0;\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\" size=\"4\" color=\"black\"><span style=\"font-size:24px;\"><b>$699.99 </b></span></font></div>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"padding:0;\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\" size=\"2\" color=\"#666666\"><span style=\"font-size:14px;font-weight:normal;\"><strike>$1,299.99</strike> 46% off List Price </span></font></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"padding:11px 0 0 0;\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\" size=\"2\" color=\"#333333\"><span style=\"font-size:14px;\">Yoga is to laptops what peanut brittle is to the color azure. :::shrug::: </span></font></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td style=\"padding:18px 0 8px 0;\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\" size=\"1\" color=\"#333333\"><span style=\"font-size:12px;\"><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=989230b07c&amp;e=1ba327495b\" target=\"_blank\"><span style=\"display:block;\"><img blockedimagesrc=\"https://d3rqdbvvokrlbl.cloudfront.net/images/email/daily-digest/shop-now.png\" width=\"171\" height=\"53\" alt=\"Shop now\">\n" +
                "</span></a></span></font></td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font></td>\n" +
                "<td align=\"right\" valign=\"top\" style=\"padding:0;\"><a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=8221d80b43&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/a0366ded-2fa7-4ecd-845b-38277a0eb660._SX328_.jpg\" width=\"328\" height=\"246\">\n" +
                "</a></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"2\" style=\"height:30px;padding:0;\">&nbsp;</td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;text-align:justify;padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td align=\"center\" style=\"text-align:center;padding-bottom:20px;\">\n" +
                "<div id=\"ecxspotlight-DailyDigestBanner\"><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=d56347e877&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"https://d3gqasl9vmjfd8.cloudfront.net/aa2c81d7-8f46-44d2-81ba-ba0238c37701.png\" width=\"600\" height=\"200\">\n" +
                "</a></div>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;text-align:justify;padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td colspan=\"3\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:100%;text-align:justify;padding:0;border-bottom:1px solid #CECECE;\">\n" +
                "<tbody><tr>\n" +
                "<td style=\"width:50%;\"><font size=\"2\"><span style=\"font-size:18px;\">BEST SELLERS</span></font></td>\n" +
                "<td align=\"right\" style=\"width:50%;\"><a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=bdc4df47b8&amp;e=1ba327495b\" target=\"_blank\"><font size=\"2\" color=\"#669510\"><span style=\"font-size:14px;\"><b>See all</b></span></font></a></td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"180\" align=\"center\" valign=\"top\" style=\"width:180px;text-align:center;padding:15px 20px 30px 0;\">\n" +
                "<a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=80c3784b95&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/1a151af9-9b3a-4ee9-80ec-3c7eee560e5b._SX180_.jpg\" width=\"180\" height=\"135\" alt=\"Triple Mount Solar Gutter Lights, 2 packs\">\n" +
                "</font></a><a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=215130e71a&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table style=\"padding:0;border-style:none;\">\n" +
                "<tbody><tr>\n" +
                "<td align=\"center\" style=\"width:100%;text-align:center;padding:25px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">Triple Mount Solar Gutter Lights, 2 packs </span></font></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td align=\"center\" style=\"width:100%;text-align:center;padding:5px 0 0 0;\">$13.99 - $18.99 </td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font></font></a></td>\n" +
                "<td width=\"180\" align=\"center\" valign=\"top\" style=\"width:180px;text-align:center;padding:15px 10px 30px 10px;\">\n" +
                "<a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=f8a6422e4b&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/17fd191b-786d-48d6-98df-b08e007abbb0._SX180_.jpg\" width=\"180\" height=\"135\" alt=\"Fire TV Stick with Voice Remote\">\n" +
                "</font></a><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=c3a17ea74f&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table style=\"padding:0;border-style:none;\">\n" +
                "<tbody><tr>\n" +
                "<td align=\"center\" style=\"width:100%;text-align:center;padding:25px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">Fire TV Stick with Voice Remote </span></font></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td align=\"center\" style=\"width:100%;text-align:center;padding:5px 0 0 0;\">$36.99 <font size=\"1\" color=\"gray\"><span style=\"font-size:12px;\">Factory Reconditioned</span></font> </td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font></font></a></td>\n" +
                "<td width=\"180\" align=\"center\" valign=\"top\" style=\"width:180px;text-align:center;padding:15px 0 30px 20px;\">\n" +
                "<a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=15ac70513d&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/e109b37c-991a-4ce1-8556-02ec190bbc4b._SX180_.jpg\" width=\"180\" height=\"135\" alt=\"UA Heatgear Sleeveless Tee, 6 Colors\">\n" +
                "</font></a><a href=\"http://woot.us1.list-manage2.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=df07af0fc7&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table style=\"padding:0;border-style:none;\">\n" +
                "<tbody><tr>\n" +
                "<td align=\"center\" style=\"width:100%;text-align:center;padding:25px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">UA Heatgear Sleeveless Tee, 6 Colors </span></font></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td align=\"center\" style=\"width:100%;text-align:center;padding:5px 0 0 0;\">$17.99 <font size=\"2\" color=\"gray\"><span style=\"font-size:14px;\"><strike>$24.99</strike></span></font> <br>\n" +
                "\n" +
                "<font size=\"2\" color=\"gray\"><span style=\"font-size:14px;\">28% off list price</span></font> </td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font></font></a></td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;text-align:justify;padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td colspan=\"3\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:100%;text-align:justify;padding:0;border-bottom:1px solid #CECECE;\">\n" +
                "<tbody><tr>\n" +
                "<td style=\"width:50%;\"><font size=\"2\"><span style=\"font-size:18px;\">NEW DEALS</span></font></td>\n" +
                "<td align=\"right\" style=\"width:50%;\"><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=6258f7b532&amp;e=1ba327495b\" target=\"_blank\"><font size=\"2\" color=\"#669510\"><span style=\"font-size:14px;\"><b>See all</b></span></font></a></td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"180\" align=\"center\" valign=\"top\" style=\"width:180px;text-align:center;padding:15px 20px 30px 0;\">\n" +
                "<a href=\"http://woot.us1.list-manage2.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=61e5bc5bed&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/a061e574-c2c4-4b0d-b215-9aaa964f0815._SX180_.jpg\" width=\"180\" height=\"135\" alt=\"Solo Millenia Slim Case for iPad Mini - Black\">\n" +
                "</font></a><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=91ab5f3ab9&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table style=\"padding:0;border-style:none;\">\n" +
                "<tbody><tr>\n" +
                "<td align=\"center\" style=\"width:100%;text-align:center;padding:25px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">Solo Millenia Slim Case for iPad Mini - Black </span></font></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td align=\"center\" style=\"width:100%;text-align:center;padding:5px 0 0 0;\">$12.99 <font size=\"2\" color=\"gray\"><span style=\"font-size:14px;\"><strike>$39.99</strike></span></font> <br>\n" +
                "\n" +
                "<font size=\"2\" color=\"gray\"><span style=\"font-size:14px;\">68% off list price</span></font> </td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font></font></a></td>\n" +
                "<td width=\"180\" align=\"center\" valign=\"top\" style=\"width:180px;text-align:center;padding:15px 10px 30px 10px;\">\n" +
                "<a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=b170e69437&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/977f351e-46f5-495b-b49a-51403b9057f5._SX180_.jpg\" width=\"180\" height=\"135\" alt=\"HP EliteBook Folio 14&quot; Intel i5 Ultrabook\">\n" +
                "</font></a><a href=\"http://woot.us1.list-manage2.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=7f366970b6&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table style=\"padding:0;border-style:none;\">\n" +
                "<tbody><tr>\n" +
                "<td align=\"center\" style=\"width:100%;text-align:center;padding:25px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">HP EliteBook Folio 14\" Intel i5 Ultrabook </span></font></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td align=\"center\" style=\"width:100%;text-align:center;padding:5px 0 0 0;\">$284.99 <font size=\"1\" color=\"gray\"><span style=\"font-size:12px;\">Refurbished; Open Box</span></font> </td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font></font></a></td>\n" +
                "<td width=\"180\" align=\"center\" valign=\"top\" style=\"width:180px;text-align:center;padding:15px 0 30px 20px;\">\n" +
                "<a href=\"http://woot.us1.list-manage2.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=674a31b587&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/46870efd-47d4-48f5-9a69-1415d473ce80._SX180_.jpg\" width=\"180\" height=\"135\" alt=\"Dell M3800 15&quot; Intel Touch Workstation\">\n" +
                "</font></a><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=937cbaf806&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table style=\"padding:0;border-style:none;\">\n" +
                "<tbody><tr>\n" +
                "<td align=\"center\" style=\"width:100%;text-align:center;padding:25px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">Dell M3800 15\" Intel Touch Workstation </span></font></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td align=\"center\" style=\"width:100%;text-align:center;padding:5px 0 0 0;\">$769.99 <font size=\"1\" color=\"gray\"><span style=\"font-size:12px;\">Factory Reconditioned; Open Box</span></font> </td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font></font></a></td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;text-align:justify;padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td colspan=\"3\" style=\"border-bottom:1px solid #CECECE;\"><font size=\"2\"><span style=\"font-size:18px;\">TODAY ONLY</span></font></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"276\" valign=\"top\" style=\"width:276px;padding:20px 0;\"><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=e7edb28a1b&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/70bc976b-373a-4a98-88d2-ab64821d16a1._SX276_.jpg\">\n" +
                "</a><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=56e90c63fd&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\">\n" +
                "<div align=\"center\" style=\"text-align:center;padding:10px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">Your Choice Mattresses and Foundations</span></font></div>\n" +
                "<div align=\"center\" style=\"text-align:center;\"><font size=\"2\"><span style=\"font-size:18px;\">$134.99 - $349.99 </span></font></div>\n" +
                "</font></a></td>\n" +
                "<td width=\"48\" style=\"width:48px;\">&nbsp;</td>\n" +
                "<td width=\"276\" valign=\"top\" style=\"width:276px;padding:20px 0;\"><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=66cfbd2ce0&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/390a4028-0cfa-4bb1-918d-847c9b2c426f._SX276_.jpg\">\n" +
                "</a><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=a930b0b9fc&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\">\n" +
                "<div align=\"center\" style=\"text-align:center;padding:10px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">Zmodo 4CH/4Cam 720p Camera sPoE NVR Security System</span></font></div>\n" +
                "<div align=\"center\" style=\"text-align:center;\"><font size=\"2\"><span style=\"font-size:18px;\">$129.99 - $159.99 </span></font></div>\n" +
                "</font></a></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"276\" valign=\"top\" style=\"width:276px;padding:20px 0;\"><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=803b6eaa13&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/216043f9-21c4-4a2a-ab15-ada4125a235a._SX276_.png\">\n" +
                "</a><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=b5c442d1e8&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\">\n" +
                "<div align=\"center\" style=\"text-align:center;padding:10px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">Corsair Gaming H2100 Wireless Dolby® 7.1 Gaming Heads</span></font></div>\n" +
                "<div align=\"center\" style=\"text-align:center;\"><font size=\"2\"><span style=\"font-size:18px;\">$49.99 </span></font><font size=\"2\" color=\"gray\"><span style=\"font-size:14px;\">Factory Reconditioned </span></font></div>\n" +
                "</font></a></td>\n" +
                "<td width=\"48\" style=\"width:48px;\">&nbsp;</td>\n" +
                "<td width=\"276\" valign=\"top\" style=\"width:276px;padding:20px 0;\"><a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=a7f2ec8c74&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/c2b3eaf9-0747-4f72-8045-609af8092468._SX276_.jpg\">\n" +
                "</a><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=1151bc489c&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\">\n" +
                "<div align=\"center\" style=\"text-align:center;padding:10px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">2-Pack Origami Pop It R1407 Shelves</span></font></div>\n" +
                "<div align=\"center\" style=\"text-align:center;\"><font size=\"2\"><span style=\"font-size:18px;\">$119.99 </span></font><font size=\"2\" color=\"gray\"><span style=\"font-size:14px;\"><strike>$169.00</strike></span></font><font size=\"2\" color=\"gray\"><span style=\"font-size:14px;\">\n" +
                "29% off List Price </span></font></div>\n" +
                "</font></a></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"3\" style=\"padding-bottom:25px;border-top:1px solid #CECECE;border-bottom:1px solid #CECECE;\">\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td style=\"height:25px;padding:0;\">&nbsp;</td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;text-align:justify;padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td width=\"147\" style=\"width:147px;padding:0;\">&nbsp;</td>\n" +
                "<td style=\"padding:15px;border:1px solid #72A00C;\"><font size=\"1\"><span style=\"font-size:12px;\">\n" +
                "<div style=\"padding:0;\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\" color=\"black\">Where are my keys?</font></div>\n" +
                "</span></font></td>\n" +
                "<td width=\"77\" valign=\"middle\" style=\"width:77px;padding:0;\"><img blockedimagesrc=\"http://d3rqdbvvokrlbl.cloudfront.net/images/email/monkey-right.2.png\" width=\"77\" height=\"57\" alt=\"Monte\"> </td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"3\" style=\"height:10px;\"><font size=\"1\"><span style=\"font-size:8px;\">&nbsp;</span></font></td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;text-align:justify;padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td width=\"68\" valign=\"middle\" style=\"width:68px;padding:0;\"><img blockedimagesrc=\"http://d3rqdbvvokrlbl.cloudfront.net/images/email/monkey-left.2.png\" width=\"68\" height=\"59\" alt=\"Mortimer\"> </td>\n" +
                "<td style=\"padding:15px;border:1px solid #0888EB;\"><font size=\"1\"><span style=\"font-size:12px;\">\n" +
                "<div style=\"padding:0;\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\" color=\"black\">I put them in my stew.</font></div>\n" +
                "</span></font></td>\n" +
                "<td width=\"147\" style=\"width:147px;padding:0;\">&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"3\" style=\"height:10px;\"><font size=\"1\"><span style=\"font-size:8px;\">&nbsp;</span></font></td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;text-align:justify;padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td width=\"147\" style=\"width:147px;padding:0;\">&nbsp;</td>\n" +
                "<td style=\"padding:15px;border:1px solid #72A00C;\"><font size=\"1\"><span style=\"font-size:12px;\">\n" +
                "<div style=\"padding:0;\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\" color=\"black\">Why?</font></div>\n" +
                "</span></font></td>\n" +
                "<td width=\"77\" valign=\"middle\" style=\"width:77px;padding:0;\"><img blockedimagesrc=\"http://d3rqdbvvokrlbl.cloudfront.net/images/email/monkey-right.2.png\" width=\"77\" height=\"57\" alt=\"Monte\"> </td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"3\" style=\"height:10px;\"><font size=\"1\"><span style=\"font-size:8px;\">&nbsp;</span></font></td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;text-align:justify;padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td width=\"68\" valign=\"middle\" style=\"width:68px;padding:0;\"><img blockedimagesrc=\"http://d3rqdbvvokrlbl.cloudfront.net/images/email/monkey-left.2.png\" width=\"68\" height=\"59\" alt=\"Mortimer\"> </td>\n" +
                "<td style=\"padding:15px;border:1px solid #0888EB;\"><font size=\"1\"><span style=\"font-size:12px;\">\n" +
                "<div style=\"padding:0;\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\" color=\"black\">They were the key ingredients. </font></div>\n" +
                "</span></font></td>\n" +
                "<td width=\"147\" style=\"width:147px;padding:0;\">&nbsp;</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"3\" style=\"height:10px;\"><font size=\"1\"><span style=\"font-size:8px;\">&nbsp;</span></font></td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;text-align:justify;padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td width=\"147\" style=\"width:147px;padding:0;\">&nbsp;</td>\n" +
                "<td style=\"padding:15px;border:1px solid #72A00C;\"><font size=\"1\"><span style=\"font-size:12px;\">\n" +
                "<div style=\"padding:0;\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\" color=\"black\">I will destroy you.</font></div>\n" +
                "</span></font></td>\n" +
                "<td width=\"77\" valign=\"middle\" style=\"width:77px;padding:0;\"><img blockedimagesrc=\"http://d3rqdbvvokrlbl.cloudfront.net/images/email/monkey-right.2.png\" width=\"77\" height=\"57\" alt=\"Monte\"> </td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td colspan=\"3\" style=\"height:10px;\"><font size=\"1\"><span style=\"font-size:8px;\">&nbsp;</span></font></td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"276\" valign=\"top\" style=\"width:276px;padding:20px 0;\"><a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=7bc5520432&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/6823067d-5679-4185-a7b4-35016071191b._SX276_.jpg\">\n" +
                "</a><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=5a046dd071&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\">\n" +
                "<div align=\"center\" style=\"text-align:center;padding:10px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">Body Glove Water Shoes</span></font></div>\n" +
                "<div align=\"center\" style=\"text-align:center;\"><font size=\"2\"><span style=\"font-size:18px;\">$9.99 - $21.99 </span></font></div>\n" +
                "</font></a></td>\n" +
                "<td width=\"48\" style=\"width:48px;\">&nbsp;</td>\n" +
                "<td width=\"276\" valign=\"top\" style=\"width:276px;padding:20px 0;\"><a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=ab92e60760&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/3821ead1-4ac2-4684-95a9-bd3f4940aceb._SX276_.jpg\">\n" +
                "</a><a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=c181482d81&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\">\n" +
                "<div align=\"center\" style=\"text-align:center;padding:10px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">Slim Fit Woven Dress Shirt</span></font></div>\n" +
                "<div align=\"center\" style=\"text-align:center;\"><font size=\"2\"><span style=\"font-size:18px;\">$12.99 </span></font></div>\n" +
                "</font></a></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"276\" valign=\"top\" style=\"width:276px;padding:20px 0;\"><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=a7a77a2e49&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/1b33e92d-aaf5-43e4-8ba7-dd8fa350f85b._SX276_.jpg\">\n" +
                "</a><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=b6cc6273e2&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\">\n" +
                "<div align=\"center\" style=\"text-align:center;padding:10px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">Mookie All Surface Pro Swingball</span></font></div>\n" +
                "<div align=\"center\" style=\"text-align:center;\"><font size=\"2\"><span style=\"font-size:18px;\">$41.99 </span></font><font size=\"2\" color=\"gray\"><span style=\"font-size:14px;\"><strike>$79.99</strike></span></font><font size=\"2\" color=\"gray\"><span style=\"font-size:14px;\">\n" +
                "48% off List Price </span></font></div>\n" +
                "</font></a></td>\n" +
                "<td width=\"48\" style=\"width:48px;\">&nbsp;</td>\n" +
                "<td width=\"276\" valign=\"top\" style=\"width:276px;padding:20px 0;\"><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=8da2b4be02&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/f81eb5f4-c980-4dc9-a9aa-56a9aad46036._SX276_.png\">\n" +
                "</a><a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=fc49d392a4&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\">\n" +
                "<div align=\"center\" style=\"text-align:center;padding:10px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">Just 'Chu It</span></font></div>\n" +
                "<div align=\"center\" style=\"text-align:center;\"><font size=\"2\"><span style=\"font-size:18px;\">$7 - $10 </span></font></div>\n" +
                "</font></a></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td width=\"276\" valign=\"top\" style=\"width:276px;padding:20px 0;\"><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=c059093f69&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/a438ebea-dc75-4020-aa08-3417ce147588._SX276_.jpg\">\n" +
                "</a><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=340edbfefb&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\">\n" +
                "<div align=\"center\" style=\"text-align:center;padding:10px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">High Valley Vineyard Cabernet Sauvignon (4)</span></font></div>\n" +
                "<div align=\"center\" style=\"text-align:center;\"><font size=\"2\"><span style=\"font-size:18px;\">$64.99 </span></font><font size=\"2\" color=\"gray\"><span style=\"font-size:14px;\"><strike>$140.00</strike></span></font><font size=\"2\" color=\"gray\"><span style=\"font-size:14px;\">\n" +
                "54% off List Price </span></font></div>\n" +
                "</font></a></td>\n" +
                "<td width=\"48\" style=\"width:48px;\">&nbsp;</td>\n" +
                "<td width=\"276\" valign=\"top\" style=\"width:276px;padding:20px 0;\"><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=9c87d1863b&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"https://images-na.ssl-images-amazon.com/images/S/mediaservice.woot.com/84bbab97-e2f5-49e8-bbcb-50a0a4752af7._SX276_.jpg\">\n" +
                "</a><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=8f22d528eb&amp;e=1ba327495b\" target=\"_blank\"><font color=\"black\">\n" +
                "<div align=\"center\" style=\"text-align:center;padding:10px 0 0 0;\"><font size=\"2\"><span style=\"font-size:16px;\">Logitech Harmony Remotes</span></font></div>\n" +
                "<div align=\"center\" style=\"text-align:center;\"><font size=\"2\"><span style=\"font-size:18px;\">$119.99 - $229.99 </span></font><font size=\"2\" color=\"gray\"><span style=\"font-size:14px;\">Factory Reconditioned </span></font></div>\n" +
                "</font></a></td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;text-align:justify;padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td width=\"300\" style=\"width:300px;padding:15px 0;border-top:1px solid #CECECE;\">\n" +
                "<a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=ea40f77fac&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"https://d3gqasl9vmjfd8.cloudfront.net/1ca78b46-92ec-4e45-a1cd-96d658c33cea.jpg\" width=\"300\" height=\"225\"></a>\n" +
                "</td>\n" +
                "<td style=\"padding:15px 0;border-top:1px solid #CECECE;\"><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=488d3c15a4&amp;e=1ba327495b\" target=\"_blank\">\n" +
                "<div style=\"padding-bottom:15px;\"><font size=\"4\" color=\"#669510\"><span style=\"font-size:22px;\">Shop Appsclusive Deals</span></font></div>\n" +
                "<div><font size=\"4\" color=\"black\"><span style=\"font-size:22px;\">Smith &amp; Wesson Black Ops M.A.G.I.C. Knives, 2 Models</span></font></div>\n" +
                "<div><font color=\"black\"><font size=\"2\"><span style=\"font-size:18px;\"><b>$11.99 </b></span></font><font size=\"1\" color=\"gray\"><span style=\"font-size:13px;\"><b><strike>$49.50</strike></b></span></font><font size=\"1\" color=\"gray\"><span style=\"font-size:13px;\"><b>\n" +
                "76% off List Price </b></span></font></font></div>\n" +
                "</a>\n" +
                "<div><font size=\"1\"><span style=\"font-size:13px;\"><b>Download now and shop on iOS and Android</b></span></font></div>\n" +
                "<div><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=fb4eb3bc05&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"http://d3rqdbvvokrlbl.cloudfront.net/images/email/daily-digest/badge-app-store.png\" width=\"135\" height=\"40\" alt=\"Download on the App Store\"></a>\n" +
                "&nbsp;&nbsp;&nbsp; <a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=6e12968b68&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"http://d3rqdbvvokrlbl.cloudfront.net/images/email/daily-digest/badge-google-play.png\" width=\"135\" height=\"40\" alt=\"Android App on Google Play\"></a>\n" +
                "</div>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font></span></div>" +
                "<div align=\"center\" style=\"text-align:center;background-color:#669410;\"><span style=\"background-color:#669410;\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;text-align:justify;padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td align=\"center\" style=\"text-align:center;padding:30px 0 10px 0;border-bottom:1px solid #425617;\">\n" +
                "<font color=\"white\"><font face=\"Helvetica,Helvetica Neue,Arial,sans-serif\">\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;text-align:justify;padding:0;\">\n" +
                "<tbody><tr>\n" +
                "<td width=\"200\" style=\"width:200px;\">&nbsp;</td>\n" +
                "<td align=\"center\" style=\"text-align:center;padding-bottom:15px;\"><a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=1b9eb5d542&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"http://d3rqdbvvokrlbl.cloudfront.net/images/email/icon-twitter.png\" width=\"32\" height=\"27\" alt=\"Twitter\"></a></td>\n" +
                "<td align=\"center\" style=\"text-align:center;padding-bottom:15px;\"><a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=aa30798417&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"http://d3rqdbvvokrlbl.cloudfront.net/images/email/icon-facebook.png\" width=\"27\" height=\"27\" alt=\"Facebook\"></a></td>\n" +
                "<td align=\"center\" style=\"text-align:center;padding-bottom:15px;\"><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=ce5c4bbcbe&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"http://d3rqdbvvokrlbl.cloudfront.net/images/email/icon-youtube.png\" width=\"38\" height=\"27\" alt=\"YouTube\"></a></td>\n" +
                "<td align=\"center\" style=\"text-align:center;padding-bottom:15px;\"><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=fbcd2513bd&amp;e=1ba327495b\" target=\"_blank\"><img blockedimagesrc=\"http://d3rqdbvvokrlbl.cloudfront.net/images/email/icon-instagram.png\" width=\"27\" height=\"27\" alt=\"Instagram\"></a></td>\n" +
                "<td width=\"200\" style=\"width:200px;\">&nbsp;</td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font>\n" +
                "<div><font size=\"2\"><span style=\"font-size:14px;\"><b><a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=7ea9efdded&amp;e=1ba327495b\" target=\"_blank\">Stuff you bought</a> | <a href=\"http://woot.us1.list-manage2.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=553b51b6dc&amp;e=1ba327495b\" target=\"_blank\">Support</a>\n" +
                "| <a href=\"http://woot.us1.list-manage2.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=acbacc7be1&amp;e=1ba327495b\" target=\"_blank\">Feedback</a> </b></span></font></div>\n" +
                "<div><font size=\"2\"><span style=\"font-size:14px;\"><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=5596ad42e3&amp;e=1ba327495b\" target=\"_blank\">Woot</a> | <a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=c117959e4f&amp;e=1ba327495b\" target=\"_blank\">Home</a>\n" +
                "| <a href=\"http://woot.us1.list-manage2.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=aea0b8f676&amp;e=1ba327495b\" target=\"_blank\">Electronics</a> | <a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=80a0db212c&amp;e=1ba327495b\" target=\"_blank\">Computers</a>\n" +
                "| <a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=0065a53e76&amp;e=1ba327495b\" target=\"_blank\">Tools &amp; Garden</a> | <a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=0a40c65ac6&amp;e=1ba327495b\" target=\"_blank\">Sport</a>\n" +
                "<br>\n" +
                "\n" +
                "<a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=c10fad3b68&amp;e=1ba327495b\" target=\"_blank\">Accessories &amp; Watches</a> | <a href=\"http://woot.us1.list-manage2.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=2783818bab&amp;e=1ba327495b\" target=\"_blank\">Kids</a>\n" +
                "| <a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=7315967a4b&amp;e=1ba327495b\" target=\"_blank\">Shirt</a> | <a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=aad28635b4&amp;e=1ba327495b\" target=\"_blank\">Wine</a>\n" +
                "| <a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=bcc6e15a8f&amp;e=1ba327495b\" target=\"_blank\">Sellout</a> </span></font></div>\n" +
                "<div><a href=\"http://woot.us1.list-manage.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=5ee35f9140&amp;e=1ba327495b\" target=\"_blank\">Want fewer emails? Manage my settings</a></div>\n" +
                "</font></td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td align=\"center\" style=\"text-align:center;padding:25px 0;\"><font size=\"1\" color=\"white\"><span style=\"font-size:10px;text-transform:none;\"><b>Woot, Inc. | 4121 International Parkway | Carrollton, Texas 75007 </b></span></font></td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</font></span></div>" +
                "<div align=\"center\" style=\"text-align:center;\">\n" +
                "<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:600px;padding:0;border-top:1px solid #D6D6D6;\">\n" +
                "<tbody><tr style=\"padding:0;\">\n" +
                "<td valign=\"top\" style=\"padding:0;\">\n" +
                "<div align=\"center\" style=\"text-align:center;padding:15px 0 0 0;\"><font face=\"Trebuchet MS,Trebuchet,Calibri,Tahoma,Arial,sans-serif\" size=\"1\" color=\"#777777\"><span style=\"font-size:10px;\"><a href=\"http://woot.us1.list-manage1.com/track/click?u=e6217fba00b9cdcae52e4e72e&amp;id=7dbafe88fe&amp;e=1ba327495b\" target=\"_blank\"><span style=\"font-weight:normal;\">Manage\n" +
                "my newsletter and account settings</span></a> or <a href=\"http://woot.us1.list-manage1.com/unsubscribe?u=e6217fba00b9cdcae52e4e72e&amp;id=c5ca76da11&amp;e=1ba327495b&amp;c=8bda0ebbf0\" target=\"_blank\"><span style=\"font-weight:normal;\">unsubscribe</span></a> from future\n" +
                "daily digests. <br>\n" +
                "\n" +
                "Woot, Inc. | 4121 International Parkway | Carrollton, Texas 75007 </span></font></div>\n" +
                "</td>\n" +
                "</tr>\n" +
                "</tbody></table>\n" +
                "</div>");
        EmailUtils.send(mail);
    }

}