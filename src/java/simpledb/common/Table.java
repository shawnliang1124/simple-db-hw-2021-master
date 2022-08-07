package simpledb.common;

import simpledb.storage.DbFile;
import simpledb.storage.TupleDesc;

/**
 * Description :   .
 *
 * @author : Phoebe
 * @date : Created in 2022/8/7
 */
public class Table {

    private DbFile file;

    private String name;

    private String pkeyField;

    private TupleDesc tupleDesc;

    public Table(DbFile file, String name, String pkeyField) {
        this.file = file;
        this.name = name;
        this.pkeyField = pkeyField;
        this.tupleDesc = file.getTupleDesc();
    }

    public DbFile getFile() {
        return file;
    }

    public String getName() {
        return name;
    }

    public String getPkeyField() {
        return pkeyField;
    }

    public TupleDesc getTupleDesc() {
        return tupleDesc;
    }
}
