// ORM class for table 'd_pais'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Mar 21 19:43:11 CET 2023
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class d_pais extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id_pais", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        d_pais.this.id_pais = (String)value;
      }
    });
    setters.put("desc_pais", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        d_pais.this.desc_pais = (String)value;
      }
    });
    setters.put("codigo_alpha2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        d_pais.this.codigo_alpha2 = (String)value;
      }
    });
  }
  public d_pais() {
    init0();
  }
  private String id_pais;
  public String get_id_pais() {
    return id_pais;
  }
  public void set_id_pais(String id_pais) {
    this.id_pais = id_pais;
  }
  public d_pais with_id_pais(String id_pais) {
    this.id_pais = id_pais;
    return this;
  }
  private String desc_pais;
  public String get_desc_pais() {
    return desc_pais;
  }
  public void set_desc_pais(String desc_pais) {
    this.desc_pais = desc_pais;
  }
  public d_pais with_desc_pais(String desc_pais) {
    this.desc_pais = desc_pais;
    return this;
  }
  private String codigo_alpha2;
  public String get_codigo_alpha2() {
    return codigo_alpha2;
  }
  public void set_codigo_alpha2(String codigo_alpha2) {
    this.codigo_alpha2 = codigo_alpha2;
  }
  public d_pais with_codigo_alpha2(String codigo_alpha2) {
    this.codigo_alpha2 = codigo_alpha2;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof d_pais)) {
      return false;
    }
    d_pais that = (d_pais) o;
    boolean equal = true;
    equal = equal && (this.id_pais == null ? that.id_pais == null : this.id_pais.equals(that.id_pais));
    equal = equal && (this.desc_pais == null ? that.desc_pais == null : this.desc_pais.equals(that.desc_pais));
    equal = equal && (this.codigo_alpha2 == null ? that.codigo_alpha2 == null : this.codigo_alpha2.equals(that.codigo_alpha2));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof d_pais)) {
      return false;
    }
    d_pais that = (d_pais) o;
    boolean equal = true;
    equal = equal && (this.id_pais == null ? that.id_pais == null : this.id_pais.equals(that.id_pais));
    equal = equal && (this.desc_pais == null ? that.desc_pais == null : this.desc_pais.equals(that.desc_pais));
    equal = equal && (this.codigo_alpha2 == null ? that.codigo_alpha2 == null : this.codigo_alpha2.equals(that.codigo_alpha2));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id_pais = JdbcWritableBridge.readString(1, __dbResults);
    this.desc_pais = JdbcWritableBridge.readString(2, __dbResults);
    this.codigo_alpha2 = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id_pais = JdbcWritableBridge.readString(1, __dbResults);
    this.desc_pais = JdbcWritableBridge.readString(2, __dbResults);
    this.codigo_alpha2 = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(id_pais, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(desc_pais, 2 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(codigo_alpha2, 3 + __off, -1, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(id_pais, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(desc_pais, 2 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(codigo_alpha2, 3 + __off, -1, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id_pais = null;
    } else {
    this.id_pais = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.desc_pais = null;
    } else {
    this.desc_pais = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.codigo_alpha2 = null;
    } else {
    this.codigo_alpha2 = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id_pais) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_pais);
    }
    if (null == this.desc_pais) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, desc_pais);
    }
    if (null == this.codigo_alpha2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, codigo_alpha2);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id_pais) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_pais);
    }
    if (null == this.desc_pais) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, desc_pais);
    }
    if (null == this.codigo_alpha2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, codigo_alpha2);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(id_pais==null?"null":id_pais, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(desc_pais==null?"null":desc_pais, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(codigo_alpha2==null?"null":codigo_alpha2, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id_pais==null?"null":id_pais, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(desc_pais==null?"null":desc_pais, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(codigo_alpha2==null?"null":codigo_alpha2, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.id_pais = null; } else {
      this.id_pais = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.desc_pais = null; } else {
      this.desc_pais = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.codigo_alpha2 = null; } else {
      this.codigo_alpha2 = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.id_pais = null; } else {
      this.id_pais = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.desc_pais = null; } else {
      this.desc_pais = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.codigo_alpha2 = null; } else {
      this.codigo_alpha2 = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    d_pais o = (d_pais) super.clone();
    return o;
  }

  public void clone0(d_pais o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id_pais", this.id_pais);
    __sqoop$field_map.put("desc_pais", this.desc_pais);
    __sqoop$field_map.put("codigo_alpha2", this.codigo_alpha2);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id_pais", this.id_pais);
    __sqoop$field_map.put("desc_pais", this.desc_pais);
    __sqoop$field_map.put("codigo_alpha2", this.codigo_alpha2);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
