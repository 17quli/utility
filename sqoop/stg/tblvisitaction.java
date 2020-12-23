// ORM class for table 'tblvisitaction'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 02:22:21 NZDT 2020
// For connector: org.apache.sqoop.manager.SQLServerManager
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

public class tblvisitaction extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fi64VisitActionKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fi64VisitActionKey = (Long)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("flngVisitKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.flngVisitKey = (Integer)value;
      }
    });
    setters.put("fstrVisitActionGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fstrVisitActionGroup = (String)value;
      }
    });
    setters.put("fstrVisitActionSubGroup", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fstrVisitActionSubGroup = (String)value;
      }
    });
    setters.put("fstrVisitAction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fstrVisitAction = (String)value;
      }
    });
    setters.put("fintVisitActionLevel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fintVisitActionLevel = (Integer)value;
      }
    });
    setters.put("flngCustomerKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.flngCustomerKey = (Integer)value;
      }
    });
    setters.put("flngAccountKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.flngAccountKey = (Integer)value;
      }
    });
    setters.put("fstrOwner", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fstrOwner = (String)value;
      }
    });
    setters.put("fdtmVisitActionStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fdtmVisitActionStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmVisitActionEnd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fdtmVisitActionEnd = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmResumed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fdtmResumed = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmDiscarded", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fdtmDiscarded = (java.sql.Timestamp)value;
      }
    });
    setters.put("flngDuration", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.flngDuration = (Integer)value;
      }
    });
    setters.put("fstrDocType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fstrDocType = (String)value;
      }
    });
    setters.put("fintDocVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fintDocVer = (Integer)value;
      }
    });
    setters.put("fi64DocEditInProgressKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fi64DocEditInProgressKey = (Long)value;
      }
    });
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngFolderKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.flngFolderKey = (Integer)value;
      }
    });
    setters.put("flngCrmKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.flngCrmKey = (Integer)value;
      }
    });
    setters.put("fstrVisitActionItemSource", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fstrVisitActionItemSource = (String)value;
      }
    });
    setters.put("fstrVisitActionItemType", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fstrVisitActionItemType = (String)value;
      }
    });
    setters.put("fi64VisitActionItemKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fi64VisitActionItemKey = (Long)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblvisitaction.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblvisitaction() {
    init0();
  }
  private Long fi64VisitActionKey;
  public Long get_fi64VisitActionKey() {
    return fi64VisitActionKey;
  }
  public void set_fi64VisitActionKey(Long fi64VisitActionKey) {
    this.fi64VisitActionKey = fi64VisitActionKey;
  }
  public tblvisitaction with_fi64VisitActionKey(Long fi64VisitActionKey) {
    this.fi64VisitActionKey = fi64VisitActionKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblvisitaction with_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
    return this;
  }
  private Integer flngVerLast;
  public Integer get_flngVerLast() {
    return flngVerLast;
  }
  public void set_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
  }
  public tblvisitaction with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer flngVisitKey;
  public Integer get_flngVisitKey() {
    return flngVisitKey;
  }
  public void set_flngVisitKey(Integer flngVisitKey) {
    this.flngVisitKey = flngVisitKey;
  }
  public tblvisitaction with_flngVisitKey(Integer flngVisitKey) {
    this.flngVisitKey = flngVisitKey;
    return this;
  }
  private String fstrVisitActionGroup;
  public String get_fstrVisitActionGroup() {
    return fstrVisitActionGroup;
  }
  public void set_fstrVisitActionGroup(String fstrVisitActionGroup) {
    this.fstrVisitActionGroup = fstrVisitActionGroup;
  }
  public tblvisitaction with_fstrVisitActionGroup(String fstrVisitActionGroup) {
    this.fstrVisitActionGroup = fstrVisitActionGroup;
    return this;
  }
  private String fstrVisitActionSubGroup;
  public String get_fstrVisitActionSubGroup() {
    return fstrVisitActionSubGroup;
  }
  public void set_fstrVisitActionSubGroup(String fstrVisitActionSubGroup) {
    this.fstrVisitActionSubGroup = fstrVisitActionSubGroup;
  }
  public tblvisitaction with_fstrVisitActionSubGroup(String fstrVisitActionSubGroup) {
    this.fstrVisitActionSubGroup = fstrVisitActionSubGroup;
    return this;
  }
  private String fstrVisitAction;
  public String get_fstrVisitAction() {
    return fstrVisitAction;
  }
  public void set_fstrVisitAction(String fstrVisitAction) {
    this.fstrVisitAction = fstrVisitAction;
  }
  public tblvisitaction with_fstrVisitAction(String fstrVisitAction) {
    this.fstrVisitAction = fstrVisitAction;
    return this;
  }
  private Integer fintVisitActionLevel;
  public Integer get_fintVisitActionLevel() {
    return fintVisitActionLevel;
  }
  public void set_fintVisitActionLevel(Integer fintVisitActionLevel) {
    this.fintVisitActionLevel = fintVisitActionLevel;
  }
  public tblvisitaction with_fintVisitActionLevel(Integer fintVisitActionLevel) {
    this.fintVisitActionLevel = fintVisitActionLevel;
    return this;
  }
  private Integer flngCustomerKey;
  public Integer get_flngCustomerKey() {
    return flngCustomerKey;
  }
  public void set_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
  }
  public tblvisitaction with_flngCustomerKey(Integer flngCustomerKey) {
    this.flngCustomerKey = flngCustomerKey;
    return this;
  }
  private Integer flngAccountKey;
  public Integer get_flngAccountKey() {
    return flngAccountKey;
  }
  public void set_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
  }
  public tblvisitaction with_flngAccountKey(Integer flngAccountKey) {
    this.flngAccountKey = flngAccountKey;
    return this;
  }
  private String fstrOwner;
  public String get_fstrOwner() {
    return fstrOwner;
  }
  public void set_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
  }
  public tblvisitaction with_fstrOwner(String fstrOwner) {
    this.fstrOwner = fstrOwner;
    return this;
  }
  private java.sql.Timestamp fdtmVisitActionStart;
  public java.sql.Timestamp get_fdtmVisitActionStart() {
    return fdtmVisitActionStart;
  }
  public void set_fdtmVisitActionStart(java.sql.Timestamp fdtmVisitActionStart) {
    this.fdtmVisitActionStart = fdtmVisitActionStart;
  }
  public tblvisitaction with_fdtmVisitActionStart(java.sql.Timestamp fdtmVisitActionStart) {
    this.fdtmVisitActionStart = fdtmVisitActionStart;
    return this;
  }
  private java.sql.Timestamp fdtmVisitActionEnd;
  public java.sql.Timestamp get_fdtmVisitActionEnd() {
    return fdtmVisitActionEnd;
  }
  public void set_fdtmVisitActionEnd(java.sql.Timestamp fdtmVisitActionEnd) {
    this.fdtmVisitActionEnd = fdtmVisitActionEnd;
  }
  public tblvisitaction with_fdtmVisitActionEnd(java.sql.Timestamp fdtmVisitActionEnd) {
    this.fdtmVisitActionEnd = fdtmVisitActionEnd;
    return this;
  }
  private java.sql.Timestamp fdtmResumed;
  public java.sql.Timestamp get_fdtmResumed() {
    return fdtmResumed;
  }
  public void set_fdtmResumed(java.sql.Timestamp fdtmResumed) {
    this.fdtmResumed = fdtmResumed;
  }
  public tblvisitaction with_fdtmResumed(java.sql.Timestamp fdtmResumed) {
    this.fdtmResumed = fdtmResumed;
    return this;
  }
  private java.sql.Timestamp fdtmDiscarded;
  public java.sql.Timestamp get_fdtmDiscarded() {
    return fdtmDiscarded;
  }
  public void set_fdtmDiscarded(java.sql.Timestamp fdtmDiscarded) {
    this.fdtmDiscarded = fdtmDiscarded;
  }
  public tblvisitaction with_fdtmDiscarded(java.sql.Timestamp fdtmDiscarded) {
    this.fdtmDiscarded = fdtmDiscarded;
    return this;
  }
  private Integer flngDuration;
  public Integer get_flngDuration() {
    return flngDuration;
  }
  public void set_flngDuration(Integer flngDuration) {
    this.flngDuration = flngDuration;
  }
  public tblvisitaction with_flngDuration(Integer flngDuration) {
    this.flngDuration = flngDuration;
    return this;
  }
  private String fstrDocType;
  public String get_fstrDocType() {
    return fstrDocType;
  }
  public void set_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
  }
  public tblvisitaction with_fstrDocType(String fstrDocType) {
    this.fstrDocType = fstrDocType;
    return this;
  }
  private Integer fintDocVer;
  public Integer get_fintDocVer() {
    return fintDocVer;
  }
  public void set_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
  }
  public tblvisitaction with_fintDocVer(Integer fintDocVer) {
    this.fintDocVer = fintDocVer;
    return this;
  }
  private Long fi64DocEditInProgressKey;
  public Long get_fi64DocEditInProgressKey() {
    return fi64DocEditInProgressKey;
  }
  public void set_fi64DocEditInProgressKey(Long fi64DocEditInProgressKey) {
    this.fi64DocEditInProgressKey = fi64DocEditInProgressKey;
  }
  public tblvisitaction with_fi64DocEditInProgressKey(Long fi64DocEditInProgressKey) {
    this.fi64DocEditInProgressKey = fi64DocEditInProgressKey;
    return this;
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblvisitaction with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngFolderKey;
  public Integer get_flngFolderKey() {
    return flngFolderKey;
  }
  public void set_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
  }
  public tblvisitaction with_flngFolderKey(Integer flngFolderKey) {
    this.flngFolderKey = flngFolderKey;
    return this;
  }
  private Integer flngCrmKey;
  public Integer get_flngCrmKey() {
    return flngCrmKey;
  }
  public void set_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
  }
  public tblvisitaction with_flngCrmKey(Integer flngCrmKey) {
    this.flngCrmKey = flngCrmKey;
    return this;
  }
  private String fstrVisitActionItemSource;
  public String get_fstrVisitActionItemSource() {
    return fstrVisitActionItemSource;
  }
  public void set_fstrVisitActionItemSource(String fstrVisitActionItemSource) {
    this.fstrVisitActionItemSource = fstrVisitActionItemSource;
  }
  public tblvisitaction with_fstrVisitActionItemSource(String fstrVisitActionItemSource) {
    this.fstrVisitActionItemSource = fstrVisitActionItemSource;
    return this;
  }
  private String fstrVisitActionItemType;
  public String get_fstrVisitActionItemType() {
    return fstrVisitActionItemType;
  }
  public void set_fstrVisitActionItemType(String fstrVisitActionItemType) {
    this.fstrVisitActionItemType = fstrVisitActionItemType;
  }
  public tblvisitaction with_fstrVisitActionItemType(String fstrVisitActionItemType) {
    this.fstrVisitActionItemType = fstrVisitActionItemType;
    return this;
  }
  private Long fi64VisitActionItemKey;
  public Long get_fi64VisitActionItemKey() {
    return fi64VisitActionItemKey;
  }
  public void set_fi64VisitActionItemKey(Long fi64VisitActionItemKey) {
    this.fi64VisitActionItemKey = fi64VisitActionItemKey;
  }
  public tblvisitaction with_fi64VisitActionItemKey(Long fi64VisitActionItemKey) {
    this.fi64VisitActionItemKey = fi64VisitActionItemKey;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblvisitaction with_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
    return this;
  }
  private java.sql.Timestamp fdtmWhen;
  public java.sql.Timestamp get_fdtmWhen() {
    return fdtmWhen;
  }
  public void set_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
  }
  public tblvisitaction with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblvisitaction)) {
      return false;
    }
    tblvisitaction that = (tblvisitaction) o;
    boolean equal = true;
    equal = equal && (this.fi64VisitActionKey == null ? that.fi64VisitActionKey == null : this.fi64VisitActionKey.equals(that.fi64VisitActionKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngVisitKey == null ? that.flngVisitKey == null : this.flngVisitKey.equals(that.flngVisitKey));
    equal = equal && (this.fstrVisitActionGroup == null ? that.fstrVisitActionGroup == null : this.fstrVisitActionGroup.equals(that.fstrVisitActionGroup));
    equal = equal && (this.fstrVisitActionSubGroup == null ? that.fstrVisitActionSubGroup == null : this.fstrVisitActionSubGroup.equals(that.fstrVisitActionSubGroup));
    equal = equal && (this.fstrVisitAction == null ? that.fstrVisitAction == null : this.fstrVisitAction.equals(that.fstrVisitAction));
    equal = equal && (this.fintVisitActionLevel == null ? that.fintVisitActionLevel == null : this.fintVisitActionLevel.equals(that.fintVisitActionLevel));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.fdtmVisitActionStart == null ? that.fdtmVisitActionStart == null : this.fdtmVisitActionStart.equals(that.fdtmVisitActionStart));
    equal = equal && (this.fdtmVisitActionEnd == null ? that.fdtmVisitActionEnd == null : this.fdtmVisitActionEnd.equals(that.fdtmVisitActionEnd));
    equal = equal && (this.fdtmResumed == null ? that.fdtmResumed == null : this.fdtmResumed.equals(that.fdtmResumed));
    equal = equal && (this.fdtmDiscarded == null ? that.fdtmDiscarded == null : this.fdtmDiscarded.equals(that.fdtmDiscarded));
    equal = equal && (this.flngDuration == null ? that.flngDuration == null : this.flngDuration.equals(that.flngDuration));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fi64DocEditInProgressKey == null ? that.fi64DocEditInProgressKey == null : this.fi64DocEditInProgressKey.equals(that.fi64DocEditInProgressKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fstrVisitActionItemSource == null ? that.fstrVisitActionItemSource == null : this.fstrVisitActionItemSource.equals(that.fstrVisitActionItemSource));
    equal = equal && (this.fstrVisitActionItemType == null ? that.fstrVisitActionItemType == null : this.fstrVisitActionItemType.equals(that.fstrVisitActionItemType));
    equal = equal && (this.fi64VisitActionItemKey == null ? that.fi64VisitActionItemKey == null : this.fi64VisitActionItemKey.equals(that.fi64VisitActionItemKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblvisitaction)) {
      return false;
    }
    tblvisitaction that = (tblvisitaction) o;
    boolean equal = true;
    equal = equal && (this.fi64VisitActionKey == null ? that.fi64VisitActionKey == null : this.fi64VisitActionKey.equals(that.fi64VisitActionKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.flngVisitKey == null ? that.flngVisitKey == null : this.flngVisitKey.equals(that.flngVisitKey));
    equal = equal && (this.fstrVisitActionGroup == null ? that.fstrVisitActionGroup == null : this.fstrVisitActionGroup.equals(that.fstrVisitActionGroup));
    equal = equal && (this.fstrVisitActionSubGroup == null ? that.fstrVisitActionSubGroup == null : this.fstrVisitActionSubGroup.equals(that.fstrVisitActionSubGroup));
    equal = equal && (this.fstrVisitAction == null ? that.fstrVisitAction == null : this.fstrVisitAction.equals(that.fstrVisitAction));
    equal = equal && (this.fintVisitActionLevel == null ? that.fintVisitActionLevel == null : this.fintVisitActionLevel.equals(that.fintVisitActionLevel));
    equal = equal && (this.flngCustomerKey == null ? that.flngCustomerKey == null : this.flngCustomerKey.equals(that.flngCustomerKey));
    equal = equal && (this.flngAccountKey == null ? that.flngAccountKey == null : this.flngAccountKey.equals(that.flngAccountKey));
    equal = equal && (this.fstrOwner == null ? that.fstrOwner == null : this.fstrOwner.equals(that.fstrOwner));
    equal = equal && (this.fdtmVisitActionStart == null ? that.fdtmVisitActionStart == null : this.fdtmVisitActionStart.equals(that.fdtmVisitActionStart));
    equal = equal && (this.fdtmVisitActionEnd == null ? that.fdtmVisitActionEnd == null : this.fdtmVisitActionEnd.equals(that.fdtmVisitActionEnd));
    equal = equal && (this.fdtmResumed == null ? that.fdtmResumed == null : this.fdtmResumed.equals(that.fdtmResumed));
    equal = equal && (this.fdtmDiscarded == null ? that.fdtmDiscarded == null : this.fdtmDiscarded.equals(that.fdtmDiscarded));
    equal = equal && (this.flngDuration == null ? that.flngDuration == null : this.flngDuration.equals(that.flngDuration));
    equal = equal && (this.fstrDocType == null ? that.fstrDocType == null : this.fstrDocType.equals(that.fstrDocType));
    equal = equal && (this.fintDocVer == null ? that.fintDocVer == null : this.fintDocVer.equals(that.fintDocVer));
    equal = equal && (this.fi64DocEditInProgressKey == null ? that.fi64DocEditInProgressKey == null : this.fi64DocEditInProgressKey.equals(that.fi64DocEditInProgressKey));
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngFolderKey == null ? that.flngFolderKey == null : this.flngFolderKey.equals(that.flngFolderKey));
    equal = equal && (this.flngCrmKey == null ? that.flngCrmKey == null : this.flngCrmKey.equals(that.flngCrmKey));
    equal = equal && (this.fstrVisitActionItemSource == null ? that.fstrVisitActionItemSource == null : this.fstrVisitActionItemSource.equals(that.fstrVisitActionItemSource));
    equal = equal && (this.fstrVisitActionItemType == null ? that.fstrVisitActionItemType == null : this.fstrVisitActionItemType.equals(that.fstrVisitActionItemType));
    equal = equal && (this.fi64VisitActionItemKey == null ? that.fi64VisitActionItemKey == null : this.fi64VisitActionItemKey.equals(that.fi64VisitActionItemKey));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fi64VisitActionKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVisitKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrVisitActionGroup = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrVisitActionSubGroup = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrVisitAction = JdbcWritableBridge.readString(7, __dbResults);
    this.fintVisitActionLevel = JdbcWritableBridge.readInteger(8, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmVisitActionStart = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmVisitActionEnd = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmResumed = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmDiscarded = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.flngDuration = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(17, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fi64DocEditInProgressKey = JdbcWritableBridge.readLong(19, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(20, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(21, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrVisitActionItemSource = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrVisitActionItemType = JdbcWritableBridge.readString(24, __dbResults);
    this.fi64VisitActionItemKey = JdbcWritableBridge.readLong(25, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fi64VisitActionKey = JdbcWritableBridge.readLong(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.flngVisitKey = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fstrVisitActionGroup = JdbcWritableBridge.readString(5, __dbResults);
    this.fstrVisitActionSubGroup = JdbcWritableBridge.readString(6, __dbResults);
    this.fstrVisitAction = JdbcWritableBridge.readString(7, __dbResults);
    this.fintVisitActionLevel = JdbcWritableBridge.readInteger(8, __dbResults);
    this.flngCustomerKey = JdbcWritableBridge.readInteger(9, __dbResults);
    this.flngAccountKey = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fstrOwner = JdbcWritableBridge.readString(11, __dbResults);
    this.fdtmVisitActionStart = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.fdtmVisitActionEnd = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.fdtmResumed = JdbcWritableBridge.readTimestamp(14, __dbResults);
    this.fdtmDiscarded = JdbcWritableBridge.readTimestamp(15, __dbResults);
    this.flngDuration = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fstrDocType = JdbcWritableBridge.readString(17, __dbResults);
    this.fintDocVer = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fi64DocEditInProgressKey = JdbcWritableBridge.readLong(19, __dbResults);
    this.flngDocKey = JdbcWritableBridge.readInteger(20, __dbResults);
    this.flngFolderKey = JdbcWritableBridge.readInteger(21, __dbResults);
    this.flngCrmKey = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fstrVisitActionItemSource = JdbcWritableBridge.readString(23, __dbResults);
    this.fstrVisitActionItemType = JdbcWritableBridge.readString(24, __dbResults);
    this.fi64VisitActionItemKey = JdbcWritableBridge.readLong(25, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(27, __dbResults);
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
    JdbcWritableBridge.writeLong(fi64VisitActionKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVisitKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitActionGroup, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitActionSubGroup, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitAction, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintVisitActionLevel, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVisitActionStart, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVisitActionEnd, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmResumed, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDiscarded, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDuration, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64DocEditInProgressKey, 19 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 22 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitActionItemSource, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitActionItemType, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64VisitActionItemKey, 25 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(fi64VisitActionKey, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVisitKey, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitActionGroup, 5 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitActionSubGroup, 6 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitAction, 7 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintVisitActionLevel, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCustomerKey, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngAccountKey, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrOwner, 11 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVisitActionStart, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmVisitActionEnd, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmResumed, 14 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmDiscarded, 15 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDuration, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrDocType, 17 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDocVer, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(fi64DocEditInProgressKey, 19 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(flngDocKey, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngFolderKey, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngCrmKey, 22 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitActionItemSource, 23 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(fstrVisitActionItemType, 24 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeLong(fi64VisitActionItemKey, 25 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fi64VisitActionKey = null;
    } else {
    this.fi64VisitActionKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVer = null;
    } else {
    this.flngVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVerLast = null;
    } else {
    this.flngVerLast = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngVisitKey = null;
    } else {
    this.flngVisitKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVisitActionGroup = null;
    } else {
    this.fstrVisitActionGroup = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVisitActionSubGroup = null;
    } else {
    this.fstrVisitActionSubGroup = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVisitAction = null;
    } else {
    this.fstrVisitAction = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintVisitActionLevel = null;
    } else {
    this.fintVisitActionLevel = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCustomerKey = null;
    } else {
    this.flngCustomerKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngAccountKey = null;
    } else {
    this.flngAccountKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrOwner = null;
    } else {
    this.fstrOwner = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmVisitActionStart = null;
    } else {
    this.fdtmVisitActionStart = new Timestamp(__dataIn.readLong());
    this.fdtmVisitActionStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmVisitActionEnd = null;
    } else {
    this.fdtmVisitActionEnd = new Timestamp(__dataIn.readLong());
    this.fdtmVisitActionEnd.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmResumed = null;
    } else {
    this.fdtmResumed = new Timestamp(__dataIn.readLong());
    this.fdtmResumed.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmDiscarded = null;
    } else {
    this.fdtmDiscarded = new Timestamp(__dataIn.readLong());
    this.fdtmDiscarded.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDuration = null;
    } else {
    this.flngDuration = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrDocType = null;
    } else {
    this.fstrDocType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fintDocVer = null;
    } else {
    this.fintDocVer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fi64DocEditInProgressKey = null;
    } else {
    this.fi64DocEditInProgressKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngFolderKey = null;
    } else {
    this.flngFolderKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngCrmKey = null;
    } else {
    this.flngCrmKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVisitActionItemSource = null;
    } else {
    this.fstrVisitActionItemSource = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fstrVisitActionItemType = null;
    } else {
    this.fstrVisitActionItemType = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fi64VisitActionItemKey = null;
    } else {
    this.fi64VisitActionItemKey = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fstrWho = null;
    } else {
    this.fstrWho = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmWhen = null;
    } else {
    this.fdtmWhen = new Timestamp(__dataIn.readLong());
    this.fdtmWhen.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.fi64VisitActionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64VisitActionKey);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngVisitKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVisitKey);
    }
    if (null == this.fstrVisitActionGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitActionGroup);
    }
    if (null == this.fstrVisitActionSubGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitActionSubGroup);
    }
    if (null == this.fstrVisitAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitAction);
    }
    if (null == this.fintVisitActionLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintVisitActionLevel);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.fdtmVisitActionStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVisitActionStart.getTime());
    __dataOut.writeInt(this.fdtmVisitActionStart.getNanos());
    }
    if (null == this.fdtmVisitActionEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVisitActionEnd.getTime());
    __dataOut.writeInt(this.fdtmVisitActionEnd.getNanos());
    }
    if (null == this.fdtmResumed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmResumed.getTime());
    __dataOut.writeInt(this.fdtmResumed.getNanos());
    }
    if (null == this.fdtmDiscarded) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDiscarded.getTime());
    __dataOut.writeInt(this.fdtmDiscarded.getNanos());
    }
    if (null == this.flngDuration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDuration);
    }
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.fi64DocEditInProgressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64DocEditInProgressKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
    }
    if (null == this.fstrVisitActionItemSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitActionItemSource);
    }
    if (null == this.fstrVisitActionItemType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitActionItemType);
    }
    if (null == this.fi64VisitActionItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64VisitActionItemKey);
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.fi64VisitActionKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64VisitActionKey);
    }
    if (null == this.flngVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVer);
    }
    if (null == this.flngVerLast) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVerLast);
    }
    if (null == this.flngVisitKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngVisitKey);
    }
    if (null == this.fstrVisitActionGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitActionGroup);
    }
    if (null == this.fstrVisitActionSubGroup) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitActionSubGroup);
    }
    if (null == this.fstrVisitAction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitAction);
    }
    if (null == this.fintVisitActionLevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintVisitActionLevel);
    }
    if (null == this.flngCustomerKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCustomerKey);
    }
    if (null == this.flngAccountKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngAccountKey);
    }
    if (null == this.fstrOwner) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrOwner);
    }
    if (null == this.fdtmVisitActionStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVisitActionStart.getTime());
    __dataOut.writeInt(this.fdtmVisitActionStart.getNanos());
    }
    if (null == this.fdtmVisitActionEnd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmVisitActionEnd.getTime());
    __dataOut.writeInt(this.fdtmVisitActionEnd.getNanos());
    }
    if (null == this.fdtmResumed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmResumed.getTime());
    __dataOut.writeInt(this.fdtmResumed.getNanos());
    }
    if (null == this.fdtmDiscarded) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmDiscarded.getTime());
    __dataOut.writeInt(this.fdtmDiscarded.getNanos());
    }
    if (null == this.flngDuration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDuration);
    }
    if (null == this.fstrDocType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrDocType);
    }
    if (null == this.fintDocVer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDocVer);
    }
    if (null == this.fi64DocEditInProgressKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64DocEditInProgressKey);
    }
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngFolderKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFolderKey);
    }
    if (null == this.flngCrmKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngCrmKey);
    }
    if (null == this.fstrVisitActionItemSource) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitActionItemSource);
    }
    if (null == this.fstrVisitActionItemType) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrVisitActionItemType);
    }
    if (null == this.fi64VisitActionItemKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fi64VisitActionItemKey);
    }
    if (null == this.fstrWho) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fstrWho);
    }
    if (null == this.fdtmWhen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmWhen.getTime());
    __dataOut.writeInt(this.fdtmWhen.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(fi64VisitActionKey==null?"\\N":"" + fi64VisitActionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVisitKey==null?"\\N":"" + flngVisitKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitActionGroup==null?"\\N":fstrVisitActionGroup, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitActionSubGroup==null?"\\N":fstrVisitActionSubGroup, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitAction==null?"\\N":fstrVisitAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintVisitActionLevel==null?"\\N":"" + fintVisitActionLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVisitActionStart==null?"\\N":"" + fdtmVisitActionStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVisitActionEnd==null?"\\N":"" + fdtmVisitActionEnd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmResumed==null?"\\N":"" + fdtmResumed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDiscarded==null?"\\N":"" + fdtmDiscarded, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDuration==null?"\\N":"" + flngDuration, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64DocEditInProgressKey==null?"\\N":"" + fi64DocEditInProgressKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitActionItemSource==null?"\\N":fstrVisitActionItemSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitActionItemType==null?"\\N":fstrVisitActionItemType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64VisitActionItemKey==null?"\\N":"" + fi64VisitActionItemKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(fi64VisitActionKey==null?"\\N":"" + fi64VisitActionKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVisitKey==null?"\\N":"" + flngVisitKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitActionGroup==null?"\\N":fstrVisitActionGroup, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitActionSubGroup==null?"\\N":fstrVisitActionSubGroup, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitAction==null?"\\N":fstrVisitAction, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintVisitActionLevel==null?"\\N":"" + fintVisitActionLevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCustomerKey==null?"\\N":"" + flngCustomerKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngAccountKey==null?"\\N":"" + flngAccountKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrOwner==null?"\\N":fstrOwner, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVisitActionStart==null?"\\N":"" + fdtmVisitActionStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmVisitActionEnd==null?"\\N":"" + fdtmVisitActionEnd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmResumed==null?"\\N":"" + fdtmResumed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmDiscarded==null?"\\N":"" + fdtmDiscarded, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDuration==null?"\\N":"" + flngDuration, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrDocType==null?"\\N":fstrDocType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDocVer==null?"\\N":"" + fintDocVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64DocEditInProgressKey==null?"\\N":"" + fi64DocEditInProgressKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngFolderKey==null?"\\N":"" + flngFolderKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngCrmKey==null?"\\N":"" + flngCrmKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitActionItemSource==null?"\\N":fstrVisitActionItemSource, " ", delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrVisitActionItemType==null?"\\N":fstrVisitActionItemType, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fi64VisitActionItemKey==null?"\\N":"" + fi64VisitActionItemKey, delimiters));
    __sb.append(fieldDelim);
    // special case for strings hive, replacing delimiters \n,\r,\01 with ' ' from strings
    __sb.append(FieldFormatter.hiveStringReplaceDelims(fstrWho==null?"\\N":fstrWho, " ", delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmWhen==null?"\\N":"" + fdtmWhen, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 34, (char) 92, false);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64VisitActionKey = null; } else {
      this.fi64VisitActionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVisitKey = null; } else {
      this.flngVisitKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitActionGroup = null; } else {
      this.fstrVisitActionGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitActionSubGroup = null; } else {
      this.fstrVisitActionSubGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitAction = null; } else {
      this.fstrVisitAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintVisitActionLevel = null; } else {
      this.fintVisitActionLevel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwner = null; } else {
      this.fstrOwner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVisitActionStart = null; } else {
      this.fdtmVisitActionStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVisitActionEnd = null; } else {
      this.fdtmVisitActionEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmResumed = null; } else {
      this.fdtmResumed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDiscarded = null; } else {
      this.fdtmDiscarded = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDuration = null; } else {
      this.flngDuration = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64DocEditInProgressKey = null; } else {
      this.fi64DocEditInProgressKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCrmKey = null; } else {
      this.flngCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitActionItemSource = null; } else {
      this.fstrVisitActionItemSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitActionItemType = null; } else {
      this.fstrVisitActionItemType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64VisitActionItemKey = null; } else {
      this.fi64VisitActionItemKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64VisitActionKey = null; } else {
      this.fi64VisitActionKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVer = null; } else {
      this.flngVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVerLast = null; } else {
      this.flngVerLast = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngVisitKey = null; } else {
      this.flngVisitKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitActionGroup = null; } else {
      this.fstrVisitActionGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitActionSubGroup = null; } else {
      this.fstrVisitActionSubGroup = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitAction = null; } else {
      this.fstrVisitAction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintVisitActionLevel = null; } else {
      this.fintVisitActionLevel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCustomerKey = null; } else {
      this.flngCustomerKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngAccountKey = null; } else {
      this.flngAccountKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrOwner = null; } else {
      this.fstrOwner = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVisitActionStart = null; } else {
      this.fdtmVisitActionStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmVisitActionEnd = null; } else {
      this.fdtmVisitActionEnd = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmResumed = null; } else {
      this.fdtmResumed = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmDiscarded = null; } else {
      this.fdtmDiscarded = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDuration = null; } else {
      this.flngDuration = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrDocType = null; } else {
      this.fstrDocType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDocVer = null; } else {
      this.fintDocVer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64DocEditInProgressKey = null; } else {
      this.fi64DocEditInProgressKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFolderKey = null; } else {
      this.flngFolderKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngCrmKey = null; } else {
      this.flngCrmKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitActionItemSource = null; } else {
      this.fstrVisitActionItemSource = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrVisitActionItemType = null; } else {
      this.fstrVisitActionItemType = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fi64VisitActionItemKey = null; } else {
      this.fi64VisitActionItemKey = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fstrWho = null; } else {
      this.fstrWho = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmWhen = null; } else {
      this.fdtmWhen = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    tblvisitaction o = (tblvisitaction) super.clone();
    o.fdtmVisitActionStart = (o.fdtmVisitActionStart != null) ? (java.sql.Timestamp) o.fdtmVisitActionStart.clone() : null;
    o.fdtmVisitActionEnd = (o.fdtmVisitActionEnd != null) ? (java.sql.Timestamp) o.fdtmVisitActionEnd.clone() : null;
    o.fdtmResumed = (o.fdtmResumed != null) ? (java.sql.Timestamp) o.fdtmResumed.clone() : null;
    o.fdtmDiscarded = (o.fdtmDiscarded != null) ? (java.sql.Timestamp) o.fdtmDiscarded.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblvisitaction o) throws CloneNotSupportedException {
    o.fdtmVisitActionStart = (o.fdtmVisitActionStart != null) ? (java.sql.Timestamp) o.fdtmVisitActionStart.clone() : null;
    o.fdtmVisitActionEnd = (o.fdtmVisitActionEnd != null) ? (java.sql.Timestamp) o.fdtmVisitActionEnd.clone() : null;
    o.fdtmResumed = (o.fdtmResumed != null) ? (java.sql.Timestamp) o.fdtmResumed.clone() : null;
    o.fdtmDiscarded = (o.fdtmDiscarded != null) ? (java.sql.Timestamp) o.fdtmDiscarded.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fi64VisitActionKey", this.fi64VisitActionKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngVisitKey", this.flngVisitKey);
    __sqoop$field_map.put("fstrVisitActionGroup", this.fstrVisitActionGroup);
    __sqoop$field_map.put("fstrVisitActionSubGroup", this.fstrVisitActionSubGroup);
    __sqoop$field_map.put("fstrVisitAction", this.fstrVisitAction);
    __sqoop$field_map.put("fintVisitActionLevel", this.fintVisitActionLevel);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("fdtmVisitActionStart", this.fdtmVisitActionStart);
    __sqoop$field_map.put("fdtmVisitActionEnd", this.fdtmVisitActionEnd);
    __sqoop$field_map.put("fdtmResumed", this.fdtmResumed);
    __sqoop$field_map.put("fdtmDiscarded", this.fdtmDiscarded);
    __sqoop$field_map.put("flngDuration", this.flngDuration);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fi64DocEditInProgressKey", this.fi64DocEditInProgressKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("fstrVisitActionItemSource", this.fstrVisitActionItemSource);
    __sqoop$field_map.put("fstrVisitActionItemType", this.fstrVisitActionItemType);
    __sqoop$field_map.put("fi64VisitActionItemKey", this.fi64VisitActionItemKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fi64VisitActionKey", this.fi64VisitActionKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("flngVisitKey", this.flngVisitKey);
    __sqoop$field_map.put("fstrVisitActionGroup", this.fstrVisitActionGroup);
    __sqoop$field_map.put("fstrVisitActionSubGroup", this.fstrVisitActionSubGroup);
    __sqoop$field_map.put("fstrVisitAction", this.fstrVisitAction);
    __sqoop$field_map.put("fintVisitActionLevel", this.fintVisitActionLevel);
    __sqoop$field_map.put("flngCustomerKey", this.flngCustomerKey);
    __sqoop$field_map.put("flngAccountKey", this.flngAccountKey);
    __sqoop$field_map.put("fstrOwner", this.fstrOwner);
    __sqoop$field_map.put("fdtmVisitActionStart", this.fdtmVisitActionStart);
    __sqoop$field_map.put("fdtmVisitActionEnd", this.fdtmVisitActionEnd);
    __sqoop$field_map.put("fdtmResumed", this.fdtmResumed);
    __sqoop$field_map.put("fdtmDiscarded", this.fdtmDiscarded);
    __sqoop$field_map.put("flngDuration", this.flngDuration);
    __sqoop$field_map.put("fstrDocType", this.fstrDocType);
    __sqoop$field_map.put("fintDocVer", this.fintDocVer);
    __sqoop$field_map.put("fi64DocEditInProgressKey", this.fi64DocEditInProgressKey);
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngFolderKey", this.flngFolderKey);
    __sqoop$field_map.put("flngCrmKey", this.flngCrmKey);
    __sqoop$field_map.put("fstrVisitActionItemSource", this.fstrVisitActionItemSource);
    __sqoop$field_map.put("fstrVisitActionItemType", this.fstrVisitActionItemType);
    __sqoop$field_map.put("fi64VisitActionItemKey", this.fi64VisitActionItemKey);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
