package ibator;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.ibatis.ibator.api.FullyQualifiedTable;
import org.apache.ibatis.ibator.api.IbatorPlugin.ModelClassType;
import org.apache.ibatis.ibator.api.IbatorPluginAdapter;
import org.apache.ibatis.ibator.api.IntrospectedColumn;
import org.apache.ibatis.ibator.api.IntrospectedTable;
import org.apache.ibatis.ibator.api.dom.java.FullyQualifiedJavaType;
import org.apache.ibatis.ibator.api.dom.java.Interface;
import org.apache.ibatis.ibator.api.dom.java.Method;
import org.apache.ibatis.ibator.api.dom.java.TopLevelClass;
import org.apache.ibatis.ibator.api.dom.xml.Document;

public class RegaltecIbatorPlugin extends IbatorPluginAdapter
{
  public boolean validate(List<String> warnings)
  {
    return true;
  }

  public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    topLevelClass.addJavaDocLine("/**");
    topLevelClass.addJavaDocLine(" * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href=\"http://ibatis.apache.org\">Ibator Documentation</a>。<p>");
    topLevelClass.addJavaDocLine(String.format(" * <p>该实体对应数据库的表名为：%s。", new Object[] { introspectedTable.getFullyQualifiedTable() }));
    topLevelClass.addJavaDocLine(String.format(" * <p>SQL映射文件路径为：%s.%s。</p>", new Object[] { introspectedTable.getSqlMapPackage(), introspectedTable.getSqlMapFileName() }));
    if (introspectedTable.hasPrimaryKeyColumns())
      topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getPrimaryKeyType().getFullyQualifiedName() }));

    if (introspectedTable.hasBaseColumns())
      topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getBaseRecordType().getFullyQualifiedName() }));

    if (introspectedTable.hasBLOBColumns())
      topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getRecordWithBLOBsType().getFullyQualifiedName() }));

    topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getExampleType().getFullyQualifiedName() }));
    topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getDAOInterfaceType().getFullyQualifiedName() }));
    topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getDAOImplementationType().getFullyQualifiedName() }));
    topLevelClass.addJavaDocLine(" * @autor ibator");
    topLevelClass.addJavaDocLine(" * @version 1.2.1");
    topLevelClass.addJavaDocLine(String.format(" * @date %1$tF %1$tT ", new Object[] { new Date() }));
    topLevelClass.addJavaDocLine(" */");
    if ((introspectedTable.hasBaseColumns()) && (!(introspectedTable.hasBLOBColumns()))) {
      topLevelClass.addAnnotation("@javax.persistence.Entity");
      topLevelClass.addAnnotation(String.format("@javax.persistence.Table(name=\"%s\")", new Object[] { introspectedTable.getFullyQualifiedTable().getIntrospectedTableName() }));
    }
    return true;
  }

  public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    topLevelClass.addJavaDocLine("/**");
    topLevelClass.addJavaDocLine(" * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href=\"http://ibatis.apache.org\">Ibator Documentation</a>。<p>");
    topLevelClass.addJavaDocLine(String.format(" * <p>该实体对应数据库的表名为：%s。", new Object[] { introspectedTable.getFullyQualifiedTable() }));
    topLevelClass.addJavaDocLine(String.format(" * <p>SQL映射文件路径为：%s.%s。</p>", new Object[] { introspectedTable.getSqlMapPackage(), introspectedTable.getSqlMapFileName() }));
    if (introspectedTable.hasPrimaryKeyColumns())
      topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getPrimaryKeyType().getFullyQualifiedName() }));

    if (introspectedTable.hasBaseColumns())
      topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getBaseRecordType().getFullyQualifiedName() }));

    if (introspectedTable.hasBLOBColumns())
      topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getRecordWithBLOBsType().getFullyQualifiedName() }));

    topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getExampleType().getFullyQualifiedName() }));
    topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getDAOInterfaceType().getFullyQualifiedName() }));
    topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getDAOImplementationType().getFullyQualifiedName() }));
    topLevelClass.addJavaDocLine(" * @autor ibator1");
    topLevelClass.addJavaDocLine(" * @version 1.2.1");
    topLevelClass.addJavaDocLine(String.format(" * @date %1$tF %1$tT ", new Object[] { new Date() }));
    topLevelClass.addJavaDocLine(" */");
    return true;
  }

  public boolean modelRecordWithBLOBsClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    topLevelClass.addJavaDocLine("/**");
    topLevelClass.addJavaDocLine(" * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href=\"http://ibatis.apache.org\">Ibator Documentation</a>。<p>");
    topLevelClass.addJavaDocLine(String.format(" * <p>该实体对应数据库的表名为：%s。</p>", new Object[] { introspectedTable.getFullyQualifiedTable() }));
    topLevelClass.addJavaDocLine(String.format(" * <p>SQL映射文件路径为：%s.%s。</p>", new Object[] { introspectedTable.getSqlMapPackage(), introspectedTable.getSqlMapFileName() }));
    if (introspectedTable.hasPrimaryKeyColumns())
      topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getPrimaryKeyType().getFullyQualifiedName() }));

    if (introspectedTable.hasBaseColumns())
      topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getBaseRecordType().getFullyQualifiedName() }));

    if (introspectedTable.hasBLOBColumns())
      topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getRecordWithBLOBsType().getFullyQualifiedName() }));

    topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getExampleType().getFullyQualifiedName() }));
    topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getDAOInterfaceType().getFullyQualifiedName() }));
    topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getDAOImplementationType().getFullyQualifiedName() }));
    topLevelClass.addJavaDocLine(" * @autor ibator");
    topLevelClass.addJavaDocLine(" * @version 1.2.1");
    topLevelClass.addJavaDocLine(String.format(" * @date %1$tF %1$tT ", new Object[] { new Date() }));
    topLevelClass.addJavaDocLine(" */");
    topLevelClass.addAnnotation("@javax.persistence.Entity");
    topLevelClass.addAnnotation(String.format("@javax.persistence.Table(name=\"%s\")", new Object[] { introspectedTable.getFullyQualifiedTable().getIntrospectedTableName() }));
    return true;
  }

  public boolean modelGetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType)
  {
    if (introspectedTable.getPrimaryKeyColumns().size() == 1) {
      IntrospectedColumn primaryKeyColumn = (IntrospectedColumn)introspectedTable.getPrimaryKeyColumns().iterator().next();
      if (primaryKeyColumn.getActualColumnName().equals(introspectedColumn.getActualColumnName()))
        method.addAnnotation("@javax.persistence.Id");
    }

    String jdbcType = introspectedColumn.getJdbcTypeName();
    if (("VARCHAR".equals(jdbcType)) || ("CHAR".equals(jdbcType)))
      method.addAnnotation(String.format("@javax.persistence.Column(name=\"%s\", nullable=%s, length=%d)", new Object[] { introspectedColumn.getActualColumnName(), String.valueOf(introspectedColumn.isNullable()), Integer.valueOf(introspectedColumn.getLength()) }));
    else
      method.addAnnotation(String.format("@javax.persistence.Column(name=\"%s\", nullable=%s)", new Object[] { introspectedColumn.getActualColumnName(), String.valueOf(introspectedColumn.isNullable()) }));

    return true;
  }

  public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable)
  {
    return true;
  }

  public void initialized(IntrospectedTable introspectedTable)
  {
    FullyQualifiedTable fullyQualifiedTable = introspectedTable.getFullyQualifiedTable();
    StringBuilder sb = new StringBuilder();
    sb.append(fullyQualifiedTable.getIntrospectedTableName().toUpperCase());
    sb.append("_SqlMap.xml");

    introspectedTable.setAttribute("org.apache.ibatis.ibator.api.IntrospectedTable.ATTR_SQL_MAP_FILE_NAME", sb.toString());
  }

  public boolean daoImplementationGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    topLevelClass.addJavaDocLine("/**");
    topLevelClass.addJavaDocLine(" * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href=\"http://ibatis.apache.org\">Ibator Documentation</a>。<p>");
    topLevelClass.addJavaDocLine(String.format(" * <p>SQL映射文件路径为：%s.%s。</p>", new Object[] { introspectedTable.getSqlMapPackage(), introspectedTable.getSqlMapFileName() }));
    if (introspectedTable.hasPrimaryKeyColumns())
      topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getPrimaryKeyType().getFullyQualifiedName() }));

    if (introspectedTable.hasBaseColumns())
      topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getBaseRecordType().getFullyQualifiedName() }));

    if (introspectedTable.hasBLOBColumns())
      topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getRecordWithBLOBsType().getFullyQualifiedName() }));

    topLevelClass.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getExampleType().getFullyQualifiedName() }));
    topLevelClass.addJavaDocLine(" * @autor ibator");
    topLevelClass.addJavaDocLine(" * @version 1.2.1");
    topLevelClass.addJavaDocLine(String.format(" * @date %1$tF %1$tT ", new Object[] { new Date() }));
    topLevelClass.addJavaDocLine(" */");
    FullyQualifiedJavaType superClass = topLevelClass.getSuperClass();
    topLevelClass.addImportedType(introspectedTable.getPrimaryKeyType());
    topLevelClass.addImportedType(introspectedTable.getExampleType());
    superClass.addTypeArgument(introspectedTable.getPrimaryKeyType());
    if (introspectedTable.hasBaseColumns())
      if (introspectedTable.hasBLOBColumns()) {
        topLevelClass.addImportedType(introspectedTable.getRecordWithBLOBsType());
        superClass.addTypeArgument(introspectedTable.getRecordWithBLOBsType());
      } else {
        topLevelClass.addImportedType(introspectedTable.getBaseRecordType());
        superClass.addTypeArgument(introspectedTable.getBaseRecordType());
      }
    else
      superClass.addTypeArgument(introspectedTable.getPrimaryKeyType());

    superClass.addTypeArgument(introspectedTable.getExampleType());
    return true;
  }

  public boolean daoInterfaceGenerated(Interface interfaze, IntrospectedTable introspectedTable)
  {
    interfaze.addJavaDocLine("/**");
    interfaze.addJavaDocLine(" * <p>该文件使用ibator工具生成，ibator使用方法可浏览<a href=\"http://ibatis.apache.org\">Ibator Documentation</a>。<p>");
    interfaze.addJavaDocLine(" * <p>继承了泛类，泛类能改名重复的代码，提高开发及维护的效率，同时一些不通用的接口方法，可以在该接口里定义。</p>");
    interfaze.addJavaDocLine(String.format(" * @see: %s", new Object[] { introspectedTable.getDAOImplementationType().getFullyQualifiedName() }));
    if (introspectedTable.hasPrimaryKeyColumns())
      interfaze.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getPrimaryKeyType().getFullyQualifiedName() }));

    if (introspectedTable.hasBaseColumns())
      interfaze.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getBaseRecordType().getFullyQualifiedName() }));

    if (introspectedTable.hasBLOBColumns())
      interfaze.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getRecordWithBLOBsType().getFullyQualifiedName() }));

    interfaze.addJavaDocLine(String.format(" * @see：%s", new Object[] { introspectedTable.getExampleType().getFullyQualifiedName() }));
    interfaze.addJavaDocLine(" * @autor ibator");
    interfaze.addJavaDocLine(" * @version 1.2.1");
    interfaze.addJavaDocLine(String.format(" * @date %1$tF %1$tT ", new Object[] { new Date() }));
    interfaze.addJavaDocLine(" */");
    label325: for (FullyQualifiedJavaType fullyQualifiedJavaType : interfaze.getSuperInterfaceTypes()) {
      if (!("BaseDAO".equals(fullyQualifiedJavaType.getShortName()))) break label325;
      interfaze.addImportedType(introspectedTable.getPrimaryKeyType());
      interfaze.addImportedType(introspectedTable.getExampleType());
      fullyQualifiedJavaType.addTypeArgument(introspectedTable.getPrimaryKeyType());
      if (introspectedTable.hasBaseColumns())
        if (introspectedTable.hasBLOBColumns()) {
          interfaze.addImportedType(introspectedTable.getRecordWithBLOBsType());
          fullyQualifiedJavaType.addTypeArgument(introspectedTable.getRecordWithBLOBsType());
        } else {
          interfaze.addImportedType(introspectedTable.getBaseRecordType());
          fullyQualifiedJavaType.addTypeArgument(introspectedTable.getBaseRecordType());
        }
      else
        fullyQualifiedJavaType.addTypeArgument(introspectedTable.getPrimaryKeyType());

      fullyQualifiedJavaType.addTypeArgument(introspectedTable.getExampleType());
    }

    return true;
  }

  public boolean daoUpdateByExampleSelectiveMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    return true;
  }

  public boolean daoUpdateByExampleWithBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    return introspectedTable.hasBLOBColumns();
  }

  public boolean daoUpdateByExampleWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    return (!(introspectedTable.hasBLOBColumns()));
  }

  public boolean daoCountByExampleMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoCountByExampleMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoDeleteByExampleMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoDeleteByExampleMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoDeleteByPrimaryKeyMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoDeleteByPrimaryKeyMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoInsertMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoInsertMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoInsertSelectiveMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoInsertSelectiveMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoSelectByExampleWithBLOBsMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoSelectByExampleWithBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoSelectByExampleWithoutBLOBsMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoSelectByExampleWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoSelectByPrimaryKeyMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoSelectByPrimaryKeyMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoUpdateByExampleSelectiveMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoUpdateByExampleWithBLOBsMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoUpdateByExampleWithoutBLOBsMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoUpdateByPrimaryKeySelectiveMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoUpdateByPrimaryKeyWithBLOBsMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoUpdateByPrimaryKeySelectiveMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoUpdateByPrimaryKeyWithBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    return false;
  }

  public boolean daoUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
  {
    return false;
  }
}