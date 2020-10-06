package org.apache.calcite.sql;

import org.apache.calcite.sql.parser.SqlParserPos;
import org.apache.calcite.sql.util.SqlVisitor;
import org.apache.calcite.sql.validate.SqlValidator;
import org.apache.calcite.sql.validate.SqlValidatorScope;
import org.apache.calcite.util.Litmus;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yan
 * Date: 2020-10-06
 * Time: 04:19
 */
public class SqlSubmit extends SqlNode {

    String jobString;

    public SqlSubmit(SqlParserPos pos, String jobString) {
        super(pos);
        this.jobString = jobString;
    }

    public String getJobString() {
        return jobString;
    }

    public SqlNode clone(SqlParserPos sqlParserPos) {
        return null;
    }

    public void unparse(SqlWriter sqlWriter, int i, int i1) {

    }

    public void validate(SqlValidator sqlValidator, SqlValidatorScope sqlValidatorScope) {

    }

    public <R> R accept(SqlVisitor<R> sqlVisitor) {
        return null;
    }

    public boolean equalsDeep(SqlNode sqlNode, Litmus litmus) {
        return false;
    }
}
