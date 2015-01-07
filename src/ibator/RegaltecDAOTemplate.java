package ibator;

import org.apache.ibatis.ibator.api.dom.java.FullyQualifiedJavaType;
import org.apache.ibatis.ibator.generator.ibatis2.dao.templates.SpringDAOTemplate;

public class RegaltecDAOTemplate extends SpringDAOTemplate
{
  protected void configureSuperClass()
  {
    setSuperClass(new FullyQualifiedJavaType("com.free.assist.dao.SpringBaseDAO"));
  }
}