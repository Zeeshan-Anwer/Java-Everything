package htmlConvertor;
import java.io.FileReader;
import java.io.IOException;

public class HtmlConvertor {

public static String convertor(String path)
{
	StringBuffer word=new StringBuffer();
	try {
	FileReader file = new FileReader(path);
	int ch = 0;
	while((ch=file.read())!=-1)
{
		word.append((char)ch);
}
	
}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	return word.toString();
}

	}