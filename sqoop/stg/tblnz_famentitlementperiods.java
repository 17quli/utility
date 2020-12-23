// ORM class for table 'tblnz_famentitlementperiods'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Dec 03 23:57:21 NZDT 2020
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

public class tblnz_famentitlementperiods extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngFAMEntitlementKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.flngFAMEntitlementKey = (Integer)value;
      }
    });
    setters.put("flngVer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.flngVer = (Integer)value;
      }
    });
    setters.put("flngVerLast", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.flngVerLast = (Integer)value;
      }
    });
    setters.put("fintRelationshipPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fintRelationshipPeriod = (Integer)value;
      }
    });
    setters.put("fintEntitlementPeriod", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fintEntitlementPeriod = (Integer)value;
      }
    });
    setters.put("fdtmStart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fdtmStart = (java.sql.Timestamp)value;
      }
    });
    setters.put("fdtmStop", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fdtmStop = (java.sql.Timestamp)value;
      }
    });
    setters.put("fintDays", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fintDays = (Integer)value;
      }
    });
    setters.put("fblnCTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fblnCTC = (Integer)value;
      }
    });
    setters.put("fblnIWTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fblnIWTC = (Integer)value;
      }
    });
    setters.put("fblnMFTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fblnMFTC = (Integer)value;
      }
    });
    setters.put("fintWeeksWorked", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fintWeeksWorked = (Integer)value;
      }
    });
    setters.put("fblnProtected", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fblnProtected = (Integer)value;
      }
    });
    setters.put("fintFOUKids", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fintFOUKids = (Integer)value;
      }
    });
    setters.put("fintSharedCare", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fintSharedCare = (Integer)value;
      }
    });
    setters.put("fintAgedLess13", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fintAgedLess13 = (Integer)value;
      }
    });
    setters.put("fintAged13To15", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fintAged13To15 = (Integer)value;
      }
    });
    setters.put("fintAged15Plus", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fintAged15Plus = (Integer)value;
      }
    });
    setters.put("fcurMFTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fcurMFTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurFTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fcurFTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurIWTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fcurIWTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurCTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fcurCTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurPTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fcurPTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurBSTC", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fcurBSTC = (java.math.BigDecimal)value;
      }
    });
    setters.put("fcurAmount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fcurAmount = (java.math.BigDecimal)value;
      }
    });
    setters.put("fblnBenefit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fblnBenefit = (Integer)value;
      }
    });
    setters.put("fblnMSD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fblnMSD = (Integer)value;
      }
    });
    setters.put("fblnActive", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fblnActive = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_famentitlementperiods.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_famentitlementperiods() {
    init0();
  }
  private Integer flngFAMEntitlementKey;
  public Integer get_flngFAMEntitlementKey() {
    return flngFAMEntitlementKey;
  }
  public void set_flngFAMEntitlementKey(Integer flngFAMEntitlementKey) {
    this.flngFAMEntitlementKey = flngFAMEntitlementKey;
  }
  public tblnz_famentitlementperiods with_flngFAMEntitlementKey(Integer flngFAMEntitlementKey) {
    this.flngFAMEntitlementKey = flngFAMEntitlementKey;
    return this;
  }
  private Integer flngVer;
  public Integer get_flngVer() {
    return flngVer;
  }
  public void set_flngVer(Integer flngVer) {
    this.flngVer = flngVer;
  }
  public tblnz_famentitlementperiods with_flngVer(Integer flngVer) {
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
  public tblnz_famentitlementperiods with_flngVerLast(Integer flngVerLast) {
    this.flngVerLast = flngVerLast;
    return this;
  }
  private Integer fintRelationshipPeriod;
  public Integer get_fintRelationshipPeriod() {
    return fintRelationshipPeriod;
  }
  public void set_fintRelationshipPeriod(Integer fintRelationshipPeriod) {
    this.fintRelationshipPeriod = fintRelationshipPeriod;
  }
  public tblnz_famentitlementperiods with_fintRelationshipPeriod(Integer fintRelationshipPeriod) {
    this.fintRelationshipPeriod = fintRelationshipPeriod;
    return this;
  }
  private Integer fintEntitlementPeriod;
  public Integer get_fintEntitlementPeriod() {
    return fintEntitlementPeriod;
  }
  public void set_fintEntitlementPeriod(Integer fintEntitlementPeriod) {
    this.fintEntitlementPeriod = fintEntitlementPeriod;
  }
  public tblnz_famentitlementperiods with_fintEntitlementPeriod(Integer fintEntitlementPeriod) {
    this.fintEntitlementPeriod = fintEntitlementPeriod;
    return this;
  }
  private java.sql.Timestamp fdtmStart;
  public java.sql.Timestamp get_fdtmStart() {
    return fdtmStart;
  }
  public void set_fdtmStart(java.sql.Timestamp fdtmStart) {
    this.fdtmStart = fdtmStart;
  }
  public tblnz_famentitlementperiods with_fdtmStart(java.sql.Timestamp fdtmStart) {
    this.fdtmStart = fdtmStart;
    return this;
  }
  private java.sql.Timestamp fdtmStop;
  public java.sql.Timestamp get_fdtmStop() {
    return fdtmStop;
  }
  public void set_fdtmStop(java.sql.Timestamp fdtmStop) {
    this.fdtmStop = fdtmStop;
  }
  public tblnz_famentitlementperiods with_fdtmStop(java.sql.Timestamp fdtmStop) {
    this.fdtmStop = fdtmStop;
    return this;
  }
  private Integer fintDays;
  public Integer get_fintDays() {
    return fintDays;
  }
  public void set_fintDays(Integer fintDays) {
    this.fintDays = fintDays;
  }
  public tblnz_famentitlementperiods with_fintDays(Integer fintDays) {
    this.fintDays = fintDays;
    return this;
  }
  private Integer fblnCTC;
  public Integer get_fblnCTC() {
    return fblnCTC;
  }
  public void set_fblnCTC(Integer fblnCTC) {
    this.fblnCTC = fblnCTC;
  }
  public tblnz_famentitlementperiods with_fblnCTC(Integer fblnCTC) {
    this.fblnCTC = fblnCTC;
    return this;
  }
  private Integer fblnIWTC;
  public Integer get_fblnIWTC() {
    return fblnIWTC;
  }
  public void set_fblnIWTC(Integer fblnIWTC) {
    this.fblnIWTC = fblnIWTC;
  }
  public tblnz_famentitlementperiods with_fblnIWTC(Integer fblnIWTC) {
    this.fblnIWTC = fblnIWTC;
    return this;
  }
  private Integer fblnMFTC;
  public Integer get_fblnMFTC() {
    return fblnMFTC;
  }
  public void set_fblnMFTC(Integer fblnMFTC) {
    this.fblnMFTC = fblnMFTC;
  }
  public tblnz_famentitlementperiods with_fblnMFTC(Integer fblnMFTC) {
    this.fblnMFTC = fblnMFTC;
    return this;
  }
  private Integer fintWeeksWorked;
  public Integer get_fintWeeksWorked() {
    return fintWeeksWorked;
  }
  public void set_fintWeeksWorked(Integer fintWeeksWorked) {
    this.fintWeeksWorked = fintWeeksWorked;
  }
  public tblnz_famentitlementperiods with_fintWeeksWorked(Integer fintWeeksWorked) {
    this.fintWeeksWorked = fintWeeksWorked;
    return this;
  }
  private Integer fblnProtected;
  public Integer get_fblnProtected() {
    return fblnProtected;
  }
  public void set_fblnProtected(Integer fblnProtected) {
    this.fblnProtected = fblnProtected;
  }
  public tblnz_famentitlementperiods with_fblnProtected(Integer fblnProtected) {
    this.fblnProtected = fblnProtected;
    return this;
  }
  private Integer fintFOUKids;
  public Integer get_fintFOUKids() {
    return fintFOUKids;
  }
  public void set_fintFOUKids(Integer fintFOUKids) {
    this.fintFOUKids = fintFOUKids;
  }
  public tblnz_famentitlementperiods with_fintFOUKids(Integer fintFOUKids) {
    this.fintFOUKids = fintFOUKids;
    return this;
  }
  private Integer fintSharedCare;
  public Integer get_fintSharedCare() {
    return fintSharedCare;
  }
  public void set_fintSharedCare(Integer fintSharedCare) {
    this.fintSharedCare = fintSharedCare;
  }
  public tblnz_famentitlementperiods with_fintSharedCare(Integer fintSharedCare) {
    this.fintSharedCare = fintSharedCare;
    return this;
  }
  private Integer fintAgedLess13;
  public Integer get_fintAgedLess13() {
    return fintAgedLess13;
  }
  public void set_fintAgedLess13(Integer fintAgedLess13) {
    this.fintAgedLess13 = fintAgedLess13;
  }
  public tblnz_famentitlementperiods with_fintAgedLess13(Integer fintAgedLess13) {
    this.fintAgedLess13 = fintAgedLess13;
    return this;
  }
  private Integer fintAged13To15;
  public Integer get_fintAged13To15() {
    return fintAged13To15;
  }
  public void set_fintAged13To15(Integer fintAged13To15) {
    this.fintAged13To15 = fintAged13To15;
  }
  public tblnz_famentitlementperiods with_fintAged13To15(Integer fintAged13To15) {
    this.fintAged13To15 = fintAged13To15;
    return this;
  }
  private Integer fintAged15Plus;
  public Integer get_fintAged15Plus() {
    return fintAged15Plus;
  }
  public void set_fintAged15Plus(Integer fintAged15Plus) {
    this.fintAged15Plus = fintAged15Plus;
  }
  public tblnz_famentitlementperiods with_fintAged15Plus(Integer fintAged15Plus) {
    this.fintAged15Plus = fintAged15Plus;
    return this;
  }
  private java.math.BigDecimal fcurMFTC;
  public java.math.BigDecimal get_fcurMFTC() {
    return fcurMFTC;
  }
  public void set_fcurMFTC(java.math.BigDecimal fcurMFTC) {
    this.fcurMFTC = fcurMFTC;
  }
  public tblnz_famentitlementperiods with_fcurMFTC(java.math.BigDecimal fcurMFTC) {
    this.fcurMFTC = fcurMFTC;
    return this;
  }
  private java.math.BigDecimal fcurFTC;
  public java.math.BigDecimal get_fcurFTC() {
    return fcurFTC;
  }
  public void set_fcurFTC(java.math.BigDecimal fcurFTC) {
    this.fcurFTC = fcurFTC;
  }
  public tblnz_famentitlementperiods with_fcurFTC(java.math.BigDecimal fcurFTC) {
    this.fcurFTC = fcurFTC;
    return this;
  }
  private java.math.BigDecimal fcurIWTC;
  public java.math.BigDecimal get_fcurIWTC() {
    return fcurIWTC;
  }
  public void set_fcurIWTC(java.math.BigDecimal fcurIWTC) {
    this.fcurIWTC = fcurIWTC;
  }
  public tblnz_famentitlementperiods with_fcurIWTC(java.math.BigDecimal fcurIWTC) {
    this.fcurIWTC = fcurIWTC;
    return this;
  }
  private java.math.BigDecimal fcurCTC;
  public java.math.BigDecimal get_fcurCTC() {
    return fcurCTC;
  }
  public void set_fcurCTC(java.math.BigDecimal fcurCTC) {
    this.fcurCTC = fcurCTC;
  }
  public tblnz_famentitlementperiods with_fcurCTC(java.math.BigDecimal fcurCTC) {
    this.fcurCTC = fcurCTC;
    return this;
  }
  private java.math.BigDecimal fcurPTC;
  public java.math.BigDecimal get_fcurPTC() {
    return fcurPTC;
  }
  public void set_fcurPTC(java.math.BigDecimal fcurPTC) {
    this.fcurPTC = fcurPTC;
  }
  public tblnz_famentitlementperiods with_fcurPTC(java.math.BigDecimal fcurPTC) {
    this.fcurPTC = fcurPTC;
    return this;
  }
  private java.math.BigDecimal fcurBSTC;
  public java.math.BigDecimal get_fcurBSTC() {
    return fcurBSTC;
  }
  public void set_fcurBSTC(java.math.BigDecimal fcurBSTC) {
    this.fcurBSTC = fcurBSTC;
  }
  public tblnz_famentitlementperiods with_fcurBSTC(java.math.BigDecimal fcurBSTC) {
    this.fcurBSTC = fcurBSTC;
    return this;
  }
  private java.math.BigDecimal fcurAmount;
  public java.math.BigDecimal get_fcurAmount() {
    return fcurAmount;
  }
  public void set_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
  }
  public tblnz_famentitlementperiods with_fcurAmount(java.math.BigDecimal fcurAmount) {
    this.fcurAmount = fcurAmount;
    return this;
  }
  private Integer fblnBenefit;
  public Integer get_fblnBenefit() {
    return fblnBenefit;
  }
  public void set_fblnBenefit(Integer fblnBenefit) {
    this.fblnBenefit = fblnBenefit;
  }
  public tblnz_famentitlementperiods with_fblnBenefit(Integer fblnBenefit) {
    this.fblnBenefit = fblnBenefit;
    return this;
  }
  private Integer fblnMSD;
  public Integer get_fblnMSD() {
    return fblnMSD;
  }
  public void set_fblnMSD(Integer fblnMSD) {
    this.fblnMSD = fblnMSD;
  }
  public tblnz_famentitlementperiods with_fblnMSD(Integer fblnMSD) {
    this.fblnMSD = fblnMSD;
    return this;
  }
  private Integer fblnActive;
  public Integer get_fblnActive() {
    return fblnActive;
  }
  public void set_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
  }
  public tblnz_famentitlementperiods with_fblnActive(Integer fblnActive) {
    this.fblnActive = fblnActive;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_famentitlementperiods with_fstrWho(String fstrWho) {
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
  public tblnz_famentitlementperiods with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_famentitlementperiods)) {
      return false;
    }
    tblnz_famentitlementperiods that = (tblnz_famentitlementperiods) o;
    boolean equal = true;
    equal = equal && (this.flngFAMEntitlementKey == null ? that.flngFAMEntitlementKey == null : this.flngFAMEntitlementKey.equals(that.flngFAMEntitlementKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fintRelationshipPeriod == null ? that.fintRelationshipPeriod == null : this.fintRelationshipPeriod.equals(that.fintRelationshipPeriod));
    equal = equal && (this.fintEntitlementPeriod == null ? that.fintEntitlementPeriod == null : this.fintEntitlementPeriod.equals(that.fintEntitlementPeriod));
    equal = equal && (this.fdtmStart == null ? that.fdtmStart == null : this.fdtmStart.equals(that.fdtmStart));
    equal = equal && (this.fdtmStop == null ? that.fdtmStop == null : this.fdtmStop.equals(that.fdtmStop));
    equal = equal && (this.fintDays == null ? that.fintDays == null : this.fintDays.equals(that.fintDays));
    equal = equal && (this.fblnCTC == null ? that.fblnCTC == null : this.fblnCTC.equals(that.fblnCTC));
    equal = equal && (this.fblnIWTC == null ? that.fblnIWTC == null : this.fblnIWTC.equals(that.fblnIWTC));
    equal = equal && (this.fblnMFTC == null ? that.fblnMFTC == null : this.fblnMFTC.equals(that.fblnMFTC));
    equal = equal && (this.fintWeeksWorked == null ? that.fintWeeksWorked == null : this.fintWeeksWorked.equals(that.fintWeeksWorked));
    equal = equal && (this.fblnProtected == null ? that.fblnProtected == null : this.fblnProtected.equals(that.fblnProtected));
    equal = equal && (this.fintFOUKids == null ? that.fintFOUKids == null : this.fintFOUKids.equals(that.fintFOUKids));
    equal = equal && (this.fintSharedCare == null ? that.fintSharedCare == null : this.fintSharedCare.equals(that.fintSharedCare));
    equal = equal && (this.fintAgedLess13 == null ? that.fintAgedLess13 == null : this.fintAgedLess13.equals(that.fintAgedLess13));
    equal = equal && (this.fintAged13To15 == null ? that.fintAged13To15 == null : this.fintAged13To15.equals(that.fintAged13To15));
    equal = equal && (this.fintAged15Plus == null ? that.fintAged15Plus == null : this.fintAged15Plus.equals(that.fintAged15Plus));
    equal = equal && (this.fcurMFTC == null ? that.fcurMFTC == null : this.fcurMFTC.equals(that.fcurMFTC));
    equal = equal && (this.fcurFTC == null ? that.fcurFTC == null : this.fcurFTC.equals(that.fcurFTC));
    equal = equal && (this.fcurIWTC == null ? that.fcurIWTC == null : this.fcurIWTC.equals(that.fcurIWTC));
    equal = equal && (this.fcurCTC == null ? that.fcurCTC == null : this.fcurCTC.equals(that.fcurCTC));
    equal = equal && (this.fcurPTC == null ? that.fcurPTC == null : this.fcurPTC.equals(that.fcurPTC));
    equal = equal && (this.fcurBSTC == null ? that.fcurBSTC == null : this.fcurBSTC.equals(that.fcurBSTC));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fblnBenefit == null ? that.fblnBenefit == null : this.fblnBenefit.equals(that.fblnBenefit));
    equal = equal && (this.fblnMSD == null ? that.fblnMSD == null : this.fblnMSD.equals(that.fblnMSD));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_famentitlementperiods)) {
      return false;
    }
    tblnz_famentitlementperiods that = (tblnz_famentitlementperiods) o;
    boolean equal = true;
    equal = equal && (this.flngFAMEntitlementKey == null ? that.flngFAMEntitlementKey == null : this.flngFAMEntitlementKey.equals(that.flngFAMEntitlementKey));
    equal = equal && (this.flngVer == null ? that.flngVer == null : this.flngVer.equals(that.flngVer));
    equal = equal && (this.flngVerLast == null ? that.flngVerLast == null : this.flngVerLast.equals(that.flngVerLast));
    equal = equal && (this.fintRelationshipPeriod == null ? that.fintRelationshipPeriod == null : this.fintRelationshipPeriod.equals(that.fintRelationshipPeriod));
    equal = equal && (this.fintEntitlementPeriod == null ? that.fintEntitlementPeriod == null : this.fintEntitlementPeriod.equals(that.fintEntitlementPeriod));
    equal = equal && (this.fdtmStart == null ? that.fdtmStart == null : this.fdtmStart.equals(that.fdtmStart));
    equal = equal && (this.fdtmStop == null ? that.fdtmStop == null : this.fdtmStop.equals(that.fdtmStop));
    equal = equal && (this.fintDays == null ? that.fintDays == null : this.fintDays.equals(that.fintDays));
    equal = equal && (this.fblnCTC == null ? that.fblnCTC == null : this.fblnCTC.equals(that.fblnCTC));
    equal = equal && (this.fblnIWTC == null ? that.fblnIWTC == null : this.fblnIWTC.equals(that.fblnIWTC));
    equal = equal && (this.fblnMFTC == null ? that.fblnMFTC == null : this.fblnMFTC.equals(that.fblnMFTC));
    equal = equal && (this.fintWeeksWorked == null ? that.fintWeeksWorked == null : this.fintWeeksWorked.equals(that.fintWeeksWorked));
    equal = equal && (this.fblnProtected == null ? that.fblnProtected == null : this.fblnProtected.equals(that.fblnProtected));
    equal = equal && (this.fintFOUKids == null ? that.fintFOUKids == null : this.fintFOUKids.equals(that.fintFOUKids));
    equal = equal && (this.fintSharedCare == null ? that.fintSharedCare == null : this.fintSharedCare.equals(that.fintSharedCare));
    equal = equal && (this.fintAgedLess13 == null ? that.fintAgedLess13 == null : this.fintAgedLess13.equals(that.fintAgedLess13));
    equal = equal && (this.fintAged13To15 == null ? that.fintAged13To15 == null : this.fintAged13To15.equals(that.fintAged13To15));
    equal = equal && (this.fintAged15Plus == null ? that.fintAged15Plus == null : this.fintAged15Plus.equals(that.fintAged15Plus));
    equal = equal && (this.fcurMFTC == null ? that.fcurMFTC == null : this.fcurMFTC.equals(that.fcurMFTC));
    equal = equal && (this.fcurFTC == null ? that.fcurFTC == null : this.fcurFTC.equals(that.fcurFTC));
    equal = equal && (this.fcurIWTC == null ? that.fcurIWTC == null : this.fcurIWTC.equals(that.fcurIWTC));
    equal = equal && (this.fcurCTC == null ? that.fcurCTC == null : this.fcurCTC.equals(that.fcurCTC));
    equal = equal && (this.fcurPTC == null ? that.fcurPTC == null : this.fcurPTC.equals(that.fcurPTC));
    equal = equal && (this.fcurBSTC == null ? that.fcurBSTC == null : this.fcurBSTC.equals(that.fcurBSTC));
    equal = equal && (this.fcurAmount == null ? that.fcurAmount == null : this.fcurAmount.equals(that.fcurAmount));
    equal = equal && (this.fblnBenefit == null ? that.fblnBenefit == null : this.fblnBenefit.equals(that.fblnBenefit));
    equal = equal && (this.fblnMSD == null ? that.fblnMSD == null : this.fblnMSD.equals(that.fblnMSD));
    equal = equal && (this.fblnActive == null ? that.fblnActive == null : this.fblnActive.equals(that.fblnActive));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngFAMEntitlementKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fintRelationshipPeriod = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fintEntitlementPeriod = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmStart = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmStop = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fintDays = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnCTC = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnIWTC = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnMFTC = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fintWeeksWorked = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnProtected = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fintFOUKids = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fintSharedCare = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fintAgedLess13 = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fintAged13To15 = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fintAged15Plus = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fcurMFTC = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurFTC = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurIWTC = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurCTC = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurPTC = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurBSTC = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fblnBenefit = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fblnMSD = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(29, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(30, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngFAMEntitlementKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngVer = JdbcWritableBridge.readInteger(2, __dbResults);
    this.flngVerLast = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fintRelationshipPeriod = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fintEntitlementPeriod = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fdtmStart = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.fdtmStop = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.fintDays = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnCTC = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnIWTC = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnMFTC = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fintWeeksWorked = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnProtected = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fintFOUKids = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fintSharedCare = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fintAgedLess13 = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fintAged13To15 = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fintAged15Plus = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fcurMFTC = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.fcurFTC = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.fcurIWTC = JdbcWritableBridge.readBigDecimal(21, __dbResults);
    this.fcurCTC = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.fcurPTC = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fcurBSTC = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fcurAmount = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.fblnBenefit = JdbcWritableBridge.readInteger(26, __dbResults);
    this.fblnMSD = JdbcWritableBridge.readInteger(27, __dbResults);
    this.fblnActive = JdbcWritableBridge.readInteger(28, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(29, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(30, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngFAMEntitlementKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintRelationshipPeriod, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintEntitlementPeriod, 5 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStart, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStop, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDays, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCTC, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIWTC, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMFTC, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintWeeksWorked, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProtected, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFOUKids, 14 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSharedCare, 15 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAgedLess13, 16 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAged13To15, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAged15Plus, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMFTC, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFTC, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIWTC, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCTC, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTC, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBSTC, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBenefit, 26 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMSD, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 30 + __off, 93, __dbStmt);
    return 30;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngFAMEntitlementKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVer, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngVerLast, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fintRelationshipPeriod, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintEntitlementPeriod, 5 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStart, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmStop, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(fintDays, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnCTC, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnIWTC, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMFTC, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintWeeksWorked, 12 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnProtected, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fintFOUKids, 14 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintSharedCare, 15 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAgedLess13, 16 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAged13To15, 17 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(fintAged15Plus, 18 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurMFTC, 19 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurFTC, 20 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurIWTC, 21 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurCTC, 22 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurPTC, 23 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurBSTC, 24 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fcurAmount, 25 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnBenefit, 26 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnMSD, 27 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnActive, 28 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 29 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 30 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngFAMEntitlementKey = null;
    } else {
    this.flngFAMEntitlementKey = Integer.valueOf(__dataIn.readInt());
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
        this.fintRelationshipPeriod = null;
    } else {
    this.fintRelationshipPeriod = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintEntitlementPeriod = null;
    } else {
    this.fintEntitlementPeriod = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStart = null;
    } else {
    this.fdtmStart = new Timestamp(__dataIn.readLong());
    this.fdtmStart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fdtmStop = null;
    } else {
    this.fdtmStop = new Timestamp(__dataIn.readLong());
    this.fdtmStop.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintDays = null;
    } else {
    this.fintDays = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnCTC = null;
    } else {
    this.fblnCTC = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnIWTC = null;
    } else {
    this.fblnIWTC = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMFTC = null;
    } else {
    this.fblnMFTC = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintWeeksWorked = null;
    } else {
    this.fintWeeksWorked = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnProtected = null;
    } else {
    this.fblnProtected = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintFOUKids = null;
    } else {
    this.fintFOUKids = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintSharedCare = null;
    } else {
    this.fintSharedCare = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintAgedLess13 = null;
    } else {
    this.fintAgedLess13 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintAged13To15 = null;
    } else {
    this.fintAged13To15 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fintAged15Plus = null;
    } else {
    this.fintAged15Plus = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fcurMFTC = null;
    } else {
    this.fcurMFTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurFTC = null;
    } else {
    this.fcurFTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurIWTC = null;
    } else {
    this.fcurIWTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurCTC = null;
    } else {
    this.fcurCTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurPTC = null;
    } else {
    this.fcurPTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurBSTC = null;
    } else {
    this.fcurBSTC = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fcurAmount = null;
    } else {
    this.fcurAmount = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fblnBenefit = null;
    } else {
    this.fblnBenefit = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnMSD = null;
    } else {
    this.fblnMSD = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnActive = null;
    } else {
    this.fblnActive = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngFAMEntitlementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMEntitlementKey);
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
    if (null == this.fintRelationshipPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintRelationshipPeriod);
    }
    if (null == this.fintEntitlementPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintEntitlementPeriod);
    }
    if (null == this.fdtmStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStart.getTime());
    __dataOut.writeInt(this.fdtmStart.getNanos());
    }
    if (null == this.fdtmStop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStop.getTime());
    __dataOut.writeInt(this.fdtmStop.getNanos());
    }
    if (null == this.fintDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDays);
    }
    if (null == this.fblnCTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCTC);
    }
    if (null == this.fblnIWTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIWTC);
    }
    if (null == this.fblnMFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMFTC);
    }
    if (null == this.fintWeeksWorked) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintWeeksWorked);
    }
    if (null == this.fblnProtected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProtected);
    }
    if (null == this.fintFOUKids) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFOUKids);
    }
    if (null == this.fintSharedCare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSharedCare);
    }
    if (null == this.fintAgedLess13) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAgedLess13);
    }
    if (null == this.fintAged13To15) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAged13To15);
    }
    if (null == this.fintAged15Plus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAged15Plus);
    }
    if (null == this.fcurMFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMFTC, __dataOut);
    }
    if (null == this.fcurFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFTC, __dataOut);
    }
    if (null == this.fcurIWTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIWTC, __dataOut);
    }
    if (null == this.fcurCTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCTC, __dataOut);
    }
    if (null == this.fcurPTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTC, __dataOut);
    }
    if (null == this.fcurBSTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBSTC, __dataOut);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fblnBenefit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBenefit);
    }
    if (null == this.fblnMSD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMSD);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    if (null == this.flngFAMEntitlementKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngFAMEntitlementKey);
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
    if (null == this.fintRelationshipPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintRelationshipPeriod);
    }
    if (null == this.fintEntitlementPeriod) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintEntitlementPeriod);
    }
    if (null == this.fdtmStart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStart.getTime());
    __dataOut.writeInt(this.fdtmStart.getNanos());
    }
    if (null == this.fdtmStop) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fdtmStop.getTime());
    __dataOut.writeInt(this.fdtmStop.getNanos());
    }
    if (null == this.fintDays) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintDays);
    }
    if (null == this.fblnCTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnCTC);
    }
    if (null == this.fblnIWTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnIWTC);
    }
    if (null == this.fblnMFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMFTC);
    }
    if (null == this.fintWeeksWorked) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintWeeksWorked);
    }
    if (null == this.fblnProtected) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnProtected);
    }
    if (null == this.fintFOUKids) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintFOUKids);
    }
    if (null == this.fintSharedCare) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintSharedCare);
    }
    if (null == this.fintAgedLess13) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAgedLess13);
    }
    if (null == this.fintAged13To15) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAged13To15);
    }
    if (null == this.fintAged15Plus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fintAged15Plus);
    }
    if (null == this.fcurMFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurMFTC, __dataOut);
    }
    if (null == this.fcurFTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurFTC, __dataOut);
    }
    if (null == this.fcurIWTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurIWTC, __dataOut);
    }
    if (null == this.fcurCTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurCTC, __dataOut);
    }
    if (null == this.fcurPTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurPTC, __dataOut);
    }
    if (null == this.fcurBSTC) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurBSTC, __dataOut);
    }
    if (null == this.fcurAmount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fcurAmount, __dataOut);
    }
    if (null == this.fblnBenefit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnBenefit);
    }
    if (null == this.fblnMSD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnMSD);
    }
    if (null == this.fblnActive) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnActive);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMEntitlementKey==null?"\\N":"" + flngFAMEntitlementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintRelationshipPeriod==null?"\\N":"" + fintRelationshipPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintEntitlementPeriod==null?"\\N":"" + fintEntitlementPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStart==null?"\\N":"" + fdtmStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStop==null?"\\N":"" + fdtmStop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDays==null?"\\N":"" + fintDays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCTC==null?"\\N":"" + fblnCTC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIWTC==null?"\\N":"" + fblnIWTC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMFTC==null?"\\N":"" + fblnMFTC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintWeeksWorked==null?"\\N":"" + fintWeeksWorked, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProtected==null?"\\N":"" + fblnProtected, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFOUKids==null?"\\N":"" + fintFOUKids, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSharedCare==null?"\\N":"" + fintSharedCare, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAgedLess13==null?"\\N":"" + fintAgedLess13, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAged13To15==null?"\\N":"" + fintAged13To15, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAged15Plus==null?"\\N":"" + fintAged15Plus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMFTC==null?"\\N":fcurMFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFTC==null?"\\N":fcurFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIWTC==null?"\\N":fcurIWTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCTC==null?"\\N":fcurCTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTC==null?"\\N":fcurPTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBSTC==null?"\\N":fcurBSTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBenefit==null?"\\N":"" + fblnBenefit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMSD==null?"\\N":"" + fblnMSD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngFAMEntitlementKey==null?"\\N":"" + flngFAMEntitlementKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVer==null?"\\N":"" + flngVer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngVerLast==null?"\\N":"" + flngVerLast, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintRelationshipPeriod==null?"\\N":"" + fintRelationshipPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintEntitlementPeriod==null?"\\N":"" + fintEntitlementPeriod, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStart==null?"\\N":"" + fdtmStart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fdtmStop==null?"\\N":"" + fdtmStop, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintDays==null?"\\N":"" + fintDays, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnCTC==null?"\\N":"" + fblnCTC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnIWTC==null?"\\N":"" + fblnIWTC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMFTC==null?"\\N":"" + fblnMFTC, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintWeeksWorked==null?"\\N":"" + fintWeeksWorked, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnProtected==null?"\\N":"" + fblnProtected, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintFOUKids==null?"\\N":"" + fintFOUKids, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintSharedCare==null?"\\N":"" + fintSharedCare, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAgedLess13==null?"\\N":"" + fintAgedLess13, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAged13To15==null?"\\N":"" + fintAged13To15, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fintAged15Plus==null?"\\N":"" + fintAged15Plus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurMFTC==null?"\\N":fcurMFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurFTC==null?"\\N":fcurFTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurIWTC==null?"\\N":fcurIWTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurCTC==null?"\\N":fcurCTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurPTC==null?"\\N":fcurPTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurBSTC==null?"\\N":fcurBSTC.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fcurAmount==null?"\\N":fcurAmount.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnBenefit==null?"\\N":"" + fblnBenefit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnMSD==null?"\\N":"" + fblnMSD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnActive==null?"\\N":"" + fblnActive, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMEntitlementKey = null; } else {
      this.flngFAMEntitlementKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintRelationshipPeriod = null; } else {
      this.fintRelationshipPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintEntitlementPeriod = null; } else {
      this.fintEntitlementPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStart = null; } else {
      this.fdtmStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStop = null; } else {
      this.fdtmStop = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDays = null; } else {
      this.fintDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCTC = null; } else {
      this.fblnCTC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIWTC = null; } else {
      this.fblnIWTC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMFTC = null; } else {
      this.fblnMFTC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintWeeksWorked = null; } else {
      this.fintWeeksWorked = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProtected = null; } else {
      this.fblnProtected = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFOUKids = null; } else {
      this.fintFOUKids = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSharedCare = null; } else {
      this.fintSharedCare = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAgedLess13 = null; } else {
      this.fintAgedLess13 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAged13To15 = null; } else {
      this.fintAged13To15 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAged15Plus = null; } else {
      this.fintAged15Plus = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMFTC = null; } else {
      this.fcurMFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFTC = null; } else {
      this.fcurFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIWTC = null; } else {
      this.fcurIWTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCTC = null; } else {
      this.fcurCTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTC = null; } else {
      this.fcurPTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBSTC = null; } else {
      this.fcurBSTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBenefit = null; } else {
      this.fblnBenefit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMSD = null; } else {
      this.fblnMSD = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngFAMEntitlementKey = null; } else {
      this.flngFAMEntitlementKey = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintRelationshipPeriod = null; } else {
      this.fintRelationshipPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintEntitlementPeriod = null; } else {
      this.fintEntitlementPeriod = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStart = null; } else {
      this.fdtmStart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fdtmStop = null; } else {
      this.fdtmStop = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintDays = null; } else {
      this.fintDays = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnCTC = null; } else {
      this.fblnCTC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnIWTC = null; } else {
      this.fblnIWTC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMFTC = null; } else {
      this.fblnMFTC = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintWeeksWorked = null; } else {
      this.fintWeeksWorked = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnProtected = null; } else {
      this.fblnProtected = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintFOUKids = null; } else {
      this.fintFOUKids = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintSharedCare = null; } else {
      this.fintSharedCare = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAgedLess13 = null; } else {
      this.fintAgedLess13 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAged13To15 = null; } else {
      this.fintAged13To15 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fintAged15Plus = null; } else {
      this.fintAged15Plus = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurMFTC = null; } else {
      this.fcurMFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurFTC = null; } else {
      this.fcurFTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurIWTC = null; } else {
      this.fcurIWTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurCTC = null; } else {
      this.fcurCTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurPTC = null; } else {
      this.fcurPTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurBSTC = null; } else {
      this.fcurBSTC = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fcurAmount = null; } else {
      this.fcurAmount = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnBenefit = null; } else {
      this.fblnBenefit = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnMSD = null; } else {
      this.fblnMSD = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnActive = null; } else {
      this.fblnActive = Integer.valueOf(__cur_str);
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
    tblnz_famentitlementperiods o = (tblnz_famentitlementperiods) super.clone();
    o.fdtmStart = (o.fdtmStart != null) ? (java.sql.Timestamp) o.fdtmStart.clone() : null;
    o.fdtmStop = (o.fdtmStop != null) ? (java.sql.Timestamp) o.fdtmStop.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_famentitlementperiods o) throws CloneNotSupportedException {
    o.fdtmStart = (o.fdtmStart != null) ? (java.sql.Timestamp) o.fdtmStart.clone() : null;
    o.fdtmStop = (o.fdtmStop != null) ? (java.sql.Timestamp) o.fdtmStop.clone() : null;
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngFAMEntitlementKey", this.flngFAMEntitlementKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fintRelationshipPeriod", this.fintRelationshipPeriod);
    __sqoop$field_map.put("fintEntitlementPeriod", this.fintEntitlementPeriod);
    __sqoop$field_map.put("fdtmStart", this.fdtmStart);
    __sqoop$field_map.put("fdtmStop", this.fdtmStop);
    __sqoop$field_map.put("fintDays", this.fintDays);
    __sqoop$field_map.put("fblnCTC", this.fblnCTC);
    __sqoop$field_map.put("fblnIWTC", this.fblnIWTC);
    __sqoop$field_map.put("fblnMFTC", this.fblnMFTC);
    __sqoop$field_map.put("fintWeeksWorked", this.fintWeeksWorked);
    __sqoop$field_map.put("fblnProtected", this.fblnProtected);
    __sqoop$field_map.put("fintFOUKids", this.fintFOUKids);
    __sqoop$field_map.put("fintSharedCare", this.fintSharedCare);
    __sqoop$field_map.put("fintAgedLess13", this.fintAgedLess13);
    __sqoop$field_map.put("fintAged13To15", this.fintAged13To15);
    __sqoop$field_map.put("fintAged15Plus", this.fintAged15Plus);
    __sqoop$field_map.put("fcurMFTC", this.fcurMFTC);
    __sqoop$field_map.put("fcurFTC", this.fcurFTC);
    __sqoop$field_map.put("fcurIWTC", this.fcurIWTC);
    __sqoop$field_map.put("fcurCTC", this.fcurCTC);
    __sqoop$field_map.put("fcurPTC", this.fcurPTC);
    __sqoop$field_map.put("fcurBSTC", this.fcurBSTC);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fblnBenefit", this.fblnBenefit);
    __sqoop$field_map.put("fblnMSD", this.fblnMSD);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngFAMEntitlementKey", this.flngFAMEntitlementKey);
    __sqoop$field_map.put("flngVer", this.flngVer);
    __sqoop$field_map.put("flngVerLast", this.flngVerLast);
    __sqoop$field_map.put("fintRelationshipPeriod", this.fintRelationshipPeriod);
    __sqoop$field_map.put("fintEntitlementPeriod", this.fintEntitlementPeriod);
    __sqoop$field_map.put("fdtmStart", this.fdtmStart);
    __sqoop$field_map.put("fdtmStop", this.fdtmStop);
    __sqoop$field_map.put("fintDays", this.fintDays);
    __sqoop$field_map.put("fblnCTC", this.fblnCTC);
    __sqoop$field_map.put("fblnIWTC", this.fblnIWTC);
    __sqoop$field_map.put("fblnMFTC", this.fblnMFTC);
    __sqoop$field_map.put("fintWeeksWorked", this.fintWeeksWorked);
    __sqoop$field_map.put("fblnProtected", this.fblnProtected);
    __sqoop$field_map.put("fintFOUKids", this.fintFOUKids);
    __sqoop$field_map.put("fintSharedCare", this.fintSharedCare);
    __sqoop$field_map.put("fintAgedLess13", this.fintAgedLess13);
    __sqoop$field_map.put("fintAged13To15", this.fintAged13To15);
    __sqoop$field_map.put("fintAged15Plus", this.fintAged15Plus);
    __sqoop$field_map.put("fcurMFTC", this.fcurMFTC);
    __sqoop$field_map.put("fcurFTC", this.fcurFTC);
    __sqoop$field_map.put("fcurIWTC", this.fcurIWTC);
    __sqoop$field_map.put("fcurCTC", this.fcurCTC);
    __sqoop$field_map.put("fcurPTC", this.fcurPTC);
    __sqoop$field_map.put("fcurBSTC", this.fcurBSTC);
    __sqoop$field_map.put("fcurAmount", this.fcurAmount);
    __sqoop$field_map.put("fblnBenefit", this.fblnBenefit);
    __sqoop$field_map.put("fblnMSD", this.fblnMSD);
    __sqoop$field_map.put("fblnActive", this.fblnActive);
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
