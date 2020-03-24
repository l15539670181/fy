package cn.fy.fy.util;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class Send {
			public String s(String num,String shouji){
				HttpClient client = new HttpClient();
				PostMethod post = new PostMethod("http://gbk.api.smschinese.cn"); 
				post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=gbk");//��ͷ�ļ�������ת��
				NameValuePair[] data ={ new NameValuePair("Uid", "qq1596626964"),new NameValuePair("Key", "d41d8cd98f00b204e980"),new NameValuePair("smsMob",shouji),new NameValuePair("smsText","验证码:"+num)};
				post.setRequestBody(data);
				try {
					client.executeMethod(post);
				} catch (HttpException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Header[] headers = post.getResponseHeaders();
				int statusCode = post.getStatusCode();
				System.out.println("statusCode:"+statusCode);
				for(Header h : headers)
					{
					System.out.println(h.toString());
					}
					String result="";
					try {
						result = new String(post.getResponseBodyAsString().getBytes("gbk"));
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					System.out.println(result);
					post.releaseConnection();
					return result;
				}
			}
			
			
	