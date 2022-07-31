import java.io.*;
class TryWith
{
public static void main(String args[])throws IOException
{
File infile=new File("f1.txt");
BufferedReader br=new BufferedReader(new FileReader(infile));
try(br)
{
String str;
while((str=br.readLine())!=null)
{
str=str.trim();
if(str.substring(0,2).equals("//"))
{
System.out.println(str.substring(2));
}
else
continue;
}
}
finally
{
br.close();
}
}

}
