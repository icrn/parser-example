package cn.icrn.calcite;

import org.apache.calcite.avatica.util.Casing;
import org.apache.calcite.avatica.util.Quoting;
import org.apache.calcite.sql.SqlNode;
import org.apache.calcite.sql.parser.SqlParser;
import org.apache.calcite.sql.parser.impl.SqlParserImpl;
import org.apache.calcite.sql.validate.SqlConformanceEnum;
import org.apache.calcite.tools.FrameworkConfig;
import org.apache.calcite.tools.Frameworks;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yan
 * Date: 2020-10-06
 * Time: 03:41
 */
public class ParserTestOne {


    public static void main(String[] args) {
        /**
         * setCaseSensitive() 大小是写否敏感，比如说列名、表名、函数名
         * setQuoting() 设置引用一个标识符，比如说MySQL中的是``, Oracle中的""
         * setQuotedCasing Quoting策略，不变，变大写或变成小写，代码中的全部设置成变大写
         * setUnquotedCasing 当标识符没有被Quoting后的策略，值同上
         */
        final FrameworkConfig config = Frameworks.newConfigBuilder()
                .parserConfig(SqlParser.configBuilder()
                        .setParserFactory(SqlParserImpl.FACTORY)
                        .setCaseSensitive(false)
                        .setQuoting(Quoting.BACK_TICK)
                        .setQuotedCasing(Casing.TO_UPPER)
                        .setUnquotedCasing(Casing.TO_UPPER)
                        .setConformance(SqlConformanceEnum.ORACLE_12)
                        .build())
                .build();

        String sql = "select ids, name from test where id < 5 and name = 'zhang'";
        SqlParser parser = SqlParser.create(sql, config.getParserConfig());
        try {
            SqlNode sqlNode = parser.parseStmt();
            System.out.println(sqlNode.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
