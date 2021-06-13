package Entities;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;



public class JsonConfigurationInput implements ConfigurationInput
{
    private String version;
    private String StudentName1;
    private String StudentName2;

    public JsonConfigurationInput(String path)
    {
        JSONObject data = createJsonObject(path);
        this.version = (String) data.get("version");
        this.StudentName1 = (String) data.get("student_name_1");
        this.StudentName2 = (String) data.get("student_name_2");
    }

    private JSONObject createJsonObject(String path)
    {
        JSONParser parser = new JSONParser();
        Object obj = new Object();
        try
        {
            obj = parser.parse(new FileReader(path));

        }
        catch (IOException | org.json.simple.parser.ParseException e)
        {
            e.printStackTrace();
        }
        JSONObject jsonObject = (JSONObject) obj;
        return jsonObject;
    }

    @Override
    public String getVersion()
    {
        return version;
    }

    @Override
    public String getStudentName1()
    {
        return StudentName1;
    }

    @Override
    public String getStudentName2()
    {
        return StudentName2;
    }

}
