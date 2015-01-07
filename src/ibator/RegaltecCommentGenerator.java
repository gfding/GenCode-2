package ibator;

import java.util.Properties;
import org.apache.ibatis.ibator.api.CommentGenerator;
import org.apache.ibatis.ibator.api.FullyQualifiedTable;
import org.apache.ibatis.ibator.api.dom.java.CompilationUnit;
import org.apache.ibatis.ibator.api.dom.java.Field;
import org.apache.ibatis.ibator.api.dom.java.InnerClass;
import org.apache.ibatis.ibator.api.dom.java.InnerEnum;
import org.apache.ibatis.ibator.api.dom.java.Method;
import org.apache.ibatis.ibator.api.dom.xml.XmlElement;

public class RegaltecCommentGenerator implements CommentGenerator {
    public void addClassComment(InnerClass innerClass, FullyQualifiedTable arg1) {
    }

    public void addComment(XmlElement arg0) {
    }

    public void addConfigurationProperties(Properties arg0) {
    }

    public void addEnumComment(InnerEnum arg0, FullyQualifiedTable arg1) {
    }

    public void addFieldComment(Field field, FullyQualifiedTable table) {
    }

    public void addFieldComment(Field arg0, FullyQualifiedTable arg1, String arg2) {
    }

    public void addGeneralMethodComment(Method arg0, FullyQualifiedTable arg1) {
    }

    public void addGetterComment(Method arg0, FullyQualifiedTable arg1, String arg2) {
    }

    public void addJavaFileComment(CompilationUnit compilationUnit) {
        compilationUnit.addFileCommentLine("/*");
        compilationUnit.addFileCommentLine(" * <p>标题: 协作管理系统</p>");
        compilationUnit.addFileCommentLine(" * <p>描述: ...</p>");
        compilationUnit.addFileCommentLine(" * <p>版权: Copyright (c) 2009</p>");
        compilationUnit.addFileCommentLine(" * <p>公司: 公司</p>");
        compilationUnit.addFileCommentLine(" * <p>网址：http://www.free.cn/");
        compilationUnit.addFileCommentLine(" */");
    }

    public void addRootComment(XmlElement arg0) {
    }

    public void addSetterComment(Method method, FullyQualifiedTable table, String columnName) {
    }
}
