// ORM class for table 'tblnz_visitfrontofhouse'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 04 07:00:19 NZDT 2020
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

public class tblnz_visitfrontofhouse extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("flngDocKey", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.flngDocKey = (Integer)value;
      }
    });
    setters.put("flngNumberOfCustomers", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.flngNumberOfCustomers = (Integer)value;
      }
    });
    setters.put("fblnAssistAppointment", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnAssistAppointment = (Integer)value;
      }
    });
    setters.put("fblnAssistIRDApp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnAssistIRDApp = (Integer)value;
      }
    });
    setters.put("fblnAssistPickUp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnAssistPickUp = (Integer)value;
      }
    });
    setters.put("fblnAssistReview", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnAssistReview = (Integer)value;
      }
    });
    setters.put("fblnEduBusInc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnEduBusInc = (Integer)value;
      }
    });
    setters.put("fblnEduCS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnEduCS = (Integer)value;
      }
    });
    setters.put("fblnEduEmployer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnEduEmployer = (Integer)value;
      }
    });
    setters.put("fblnEduGST", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnEduGST = (Integer)value;
      }
    });
    setters.put("fblnEduFam", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnEduFam = (Integer)value;
      }
    });
    setters.put("fblnEduKiwisaver", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnEduKiwisaver = (Integer)value;
      }
    });
    setters.put("fblnEduPPL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnEduPPL = (Integer)value;
      }
    });
    setters.put("fblnEduRebate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnEduRebate = (Integer)value;
      }
    });
    setters.put("fblnEduReturns", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnEduReturns = (Integer)value;
      }
    });
    setters.put("fblnEduSLS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnEduSLS = (Integer)value;
      }
    });
    setters.put("fblnEduSW", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnEduSW = (Integer)value;
      }
    });
    setters.put("fblnEduTaxAgent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnEduTaxAgent = (Integer)value;
      }
    });
    setters.put("fblnUpdIRD", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnUpdIRD = (Integer)value;
      }
    });
    setters.put("fblnUpdInfo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnUpdInfo = (Integer)value;
      }
    });
    setters.put("fblnUpdInc", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnUpdInc = (Integer)value;
      }
    });
    setters.put("fblnReDropBox", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnReDropBox = (Integer)value;
      }
    });
    setters.put("fblnReMyIR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnReMyIR = (Integer)value;
      }
    });
    setters.put("fblnReOtherOrg", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnReOtherOrg = (Integer)value;
      }
    });
    setters.put("fblnRePhones", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fblnRePhones = (Integer)value;
      }
    });
    setters.put("fstrWho", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fstrWho = (String)value;
      }
    });
    setters.put("fdtmWhen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        tblnz_visitfrontofhouse.this.fdtmWhen = (java.sql.Timestamp)value;
      }
    });
  }
  public tblnz_visitfrontofhouse() {
    init0();
  }
  private Integer flngDocKey;
  public Integer get_flngDocKey() {
    return flngDocKey;
  }
  public void set_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
  }
  public tblnz_visitfrontofhouse with_flngDocKey(Integer flngDocKey) {
    this.flngDocKey = flngDocKey;
    return this;
  }
  private Integer flngNumberOfCustomers;
  public Integer get_flngNumberOfCustomers() {
    return flngNumberOfCustomers;
  }
  public void set_flngNumberOfCustomers(Integer flngNumberOfCustomers) {
    this.flngNumberOfCustomers = flngNumberOfCustomers;
  }
  public tblnz_visitfrontofhouse with_flngNumberOfCustomers(Integer flngNumberOfCustomers) {
    this.flngNumberOfCustomers = flngNumberOfCustomers;
    return this;
  }
  private Integer fblnAssistAppointment;
  public Integer get_fblnAssistAppointment() {
    return fblnAssistAppointment;
  }
  public void set_fblnAssistAppointment(Integer fblnAssistAppointment) {
    this.fblnAssistAppointment = fblnAssistAppointment;
  }
  public tblnz_visitfrontofhouse with_fblnAssistAppointment(Integer fblnAssistAppointment) {
    this.fblnAssistAppointment = fblnAssistAppointment;
    return this;
  }
  private Integer fblnAssistIRDApp;
  public Integer get_fblnAssistIRDApp() {
    return fblnAssistIRDApp;
  }
  public void set_fblnAssistIRDApp(Integer fblnAssistIRDApp) {
    this.fblnAssistIRDApp = fblnAssistIRDApp;
  }
  public tblnz_visitfrontofhouse with_fblnAssistIRDApp(Integer fblnAssistIRDApp) {
    this.fblnAssistIRDApp = fblnAssistIRDApp;
    return this;
  }
  private Integer fblnAssistPickUp;
  public Integer get_fblnAssistPickUp() {
    return fblnAssistPickUp;
  }
  public void set_fblnAssistPickUp(Integer fblnAssistPickUp) {
    this.fblnAssistPickUp = fblnAssistPickUp;
  }
  public tblnz_visitfrontofhouse with_fblnAssistPickUp(Integer fblnAssistPickUp) {
    this.fblnAssistPickUp = fblnAssistPickUp;
    return this;
  }
  private Integer fblnAssistReview;
  public Integer get_fblnAssistReview() {
    return fblnAssistReview;
  }
  public void set_fblnAssistReview(Integer fblnAssistReview) {
    this.fblnAssistReview = fblnAssistReview;
  }
  public tblnz_visitfrontofhouse with_fblnAssistReview(Integer fblnAssistReview) {
    this.fblnAssistReview = fblnAssistReview;
    return this;
  }
  private Integer fblnEduBusInc;
  public Integer get_fblnEduBusInc() {
    return fblnEduBusInc;
  }
  public void set_fblnEduBusInc(Integer fblnEduBusInc) {
    this.fblnEduBusInc = fblnEduBusInc;
  }
  public tblnz_visitfrontofhouse with_fblnEduBusInc(Integer fblnEduBusInc) {
    this.fblnEduBusInc = fblnEduBusInc;
    return this;
  }
  private Integer fblnEduCS;
  public Integer get_fblnEduCS() {
    return fblnEduCS;
  }
  public void set_fblnEduCS(Integer fblnEduCS) {
    this.fblnEduCS = fblnEduCS;
  }
  public tblnz_visitfrontofhouse with_fblnEduCS(Integer fblnEduCS) {
    this.fblnEduCS = fblnEduCS;
    return this;
  }
  private Integer fblnEduEmployer;
  public Integer get_fblnEduEmployer() {
    return fblnEduEmployer;
  }
  public void set_fblnEduEmployer(Integer fblnEduEmployer) {
    this.fblnEduEmployer = fblnEduEmployer;
  }
  public tblnz_visitfrontofhouse with_fblnEduEmployer(Integer fblnEduEmployer) {
    this.fblnEduEmployer = fblnEduEmployer;
    return this;
  }
  private Integer fblnEduGST;
  public Integer get_fblnEduGST() {
    return fblnEduGST;
  }
  public void set_fblnEduGST(Integer fblnEduGST) {
    this.fblnEduGST = fblnEduGST;
  }
  public tblnz_visitfrontofhouse with_fblnEduGST(Integer fblnEduGST) {
    this.fblnEduGST = fblnEduGST;
    return this;
  }
  private Integer fblnEduFam;
  public Integer get_fblnEduFam() {
    return fblnEduFam;
  }
  public void set_fblnEduFam(Integer fblnEduFam) {
    this.fblnEduFam = fblnEduFam;
  }
  public tblnz_visitfrontofhouse with_fblnEduFam(Integer fblnEduFam) {
    this.fblnEduFam = fblnEduFam;
    return this;
  }
  private Integer fblnEduKiwisaver;
  public Integer get_fblnEduKiwisaver() {
    return fblnEduKiwisaver;
  }
  public void set_fblnEduKiwisaver(Integer fblnEduKiwisaver) {
    this.fblnEduKiwisaver = fblnEduKiwisaver;
  }
  public tblnz_visitfrontofhouse with_fblnEduKiwisaver(Integer fblnEduKiwisaver) {
    this.fblnEduKiwisaver = fblnEduKiwisaver;
    return this;
  }
  private Integer fblnEduPPL;
  public Integer get_fblnEduPPL() {
    return fblnEduPPL;
  }
  public void set_fblnEduPPL(Integer fblnEduPPL) {
    this.fblnEduPPL = fblnEduPPL;
  }
  public tblnz_visitfrontofhouse with_fblnEduPPL(Integer fblnEduPPL) {
    this.fblnEduPPL = fblnEduPPL;
    return this;
  }
  private Integer fblnEduRebate;
  public Integer get_fblnEduRebate() {
    return fblnEduRebate;
  }
  public void set_fblnEduRebate(Integer fblnEduRebate) {
    this.fblnEduRebate = fblnEduRebate;
  }
  public tblnz_visitfrontofhouse with_fblnEduRebate(Integer fblnEduRebate) {
    this.fblnEduRebate = fblnEduRebate;
    return this;
  }
  private Integer fblnEduReturns;
  public Integer get_fblnEduReturns() {
    return fblnEduReturns;
  }
  public void set_fblnEduReturns(Integer fblnEduReturns) {
    this.fblnEduReturns = fblnEduReturns;
  }
  public tblnz_visitfrontofhouse with_fblnEduReturns(Integer fblnEduReturns) {
    this.fblnEduReturns = fblnEduReturns;
    return this;
  }
  private Integer fblnEduSLS;
  public Integer get_fblnEduSLS() {
    return fblnEduSLS;
  }
  public void set_fblnEduSLS(Integer fblnEduSLS) {
    this.fblnEduSLS = fblnEduSLS;
  }
  public tblnz_visitfrontofhouse with_fblnEduSLS(Integer fblnEduSLS) {
    this.fblnEduSLS = fblnEduSLS;
    return this;
  }
  private Integer fblnEduSW;
  public Integer get_fblnEduSW() {
    return fblnEduSW;
  }
  public void set_fblnEduSW(Integer fblnEduSW) {
    this.fblnEduSW = fblnEduSW;
  }
  public tblnz_visitfrontofhouse with_fblnEduSW(Integer fblnEduSW) {
    this.fblnEduSW = fblnEduSW;
    return this;
  }
  private Integer fblnEduTaxAgent;
  public Integer get_fblnEduTaxAgent() {
    return fblnEduTaxAgent;
  }
  public void set_fblnEduTaxAgent(Integer fblnEduTaxAgent) {
    this.fblnEduTaxAgent = fblnEduTaxAgent;
  }
  public tblnz_visitfrontofhouse with_fblnEduTaxAgent(Integer fblnEduTaxAgent) {
    this.fblnEduTaxAgent = fblnEduTaxAgent;
    return this;
  }
  private Integer fblnUpdIRD;
  public Integer get_fblnUpdIRD() {
    return fblnUpdIRD;
  }
  public void set_fblnUpdIRD(Integer fblnUpdIRD) {
    this.fblnUpdIRD = fblnUpdIRD;
  }
  public tblnz_visitfrontofhouse with_fblnUpdIRD(Integer fblnUpdIRD) {
    this.fblnUpdIRD = fblnUpdIRD;
    return this;
  }
  private Integer fblnUpdInfo;
  public Integer get_fblnUpdInfo() {
    return fblnUpdInfo;
  }
  public void set_fblnUpdInfo(Integer fblnUpdInfo) {
    this.fblnUpdInfo = fblnUpdInfo;
  }
  public tblnz_visitfrontofhouse with_fblnUpdInfo(Integer fblnUpdInfo) {
    this.fblnUpdInfo = fblnUpdInfo;
    return this;
  }
  private Integer fblnUpdInc;
  public Integer get_fblnUpdInc() {
    return fblnUpdInc;
  }
  public void set_fblnUpdInc(Integer fblnUpdInc) {
    this.fblnUpdInc = fblnUpdInc;
  }
  public tblnz_visitfrontofhouse with_fblnUpdInc(Integer fblnUpdInc) {
    this.fblnUpdInc = fblnUpdInc;
    return this;
  }
  private Integer fblnReDropBox;
  public Integer get_fblnReDropBox() {
    return fblnReDropBox;
  }
  public void set_fblnReDropBox(Integer fblnReDropBox) {
    this.fblnReDropBox = fblnReDropBox;
  }
  public tblnz_visitfrontofhouse with_fblnReDropBox(Integer fblnReDropBox) {
    this.fblnReDropBox = fblnReDropBox;
    return this;
  }
  private Integer fblnReMyIR;
  public Integer get_fblnReMyIR() {
    return fblnReMyIR;
  }
  public void set_fblnReMyIR(Integer fblnReMyIR) {
    this.fblnReMyIR = fblnReMyIR;
  }
  public tblnz_visitfrontofhouse with_fblnReMyIR(Integer fblnReMyIR) {
    this.fblnReMyIR = fblnReMyIR;
    return this;
  }
  private Integer fblnReOtherOrg;
  public Integer get_fblnReOtherOrg() {
    return fblnReOtherOrg;
  }
  public void set_fblnReOtherOrg(Integer fblnReOtherOrg) {
    this.fblnReOtherOrg = fblnReOtherOrg;
  }
  public tblnz_visitfrontofhouse with_fblnReOtherOrg(Integer fblnReOtherOrg) {
    this.fblnReOtherOrg = fblnReOtherOrg;
    return this;
  }
  private Integer fblnRePhones;
  public Integer get_fblnRePhones() {
    return fblnRePhones;
  }
  public void set_fblnRePhones(Integer fblnRePhones) {
    this.fblnRePhones = fblnRePhones;
  }
  public tblnz_visitfrontofhouse with_fblnRePhones(Integer fblnRePhones) {
    this.fblnRePhones = fblnRePhones;
    return this;
  }
  private String fstrWho;
  public String get_fstrWho() {
    return fstrWho;
  }
  public void set_fstrWho(String fstrWho) {
    this.fstrWho = fstrWho;
  }
  public tblnz_visitfrontofhouse with_fstrWho(String fstrWho) {
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
  public tblnz_visitfrontofhouse with_fdtmWhen(java.sql.Timestamp fdtmWhen) {
    this.fdtmWhen = fdtmWhen;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_visitfrontofhouse)) {
      return false;
    }
    tblnz_visitfrontofhouse that = (tblnz_visitfrontofhouse) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngNumberOfCustomers == null ? that.flngNumberOfCustomers == null : this.flngNumberOfCustomers.equals(that.flngNumberOfCustomers));
    equal = equal && (this.fblnAssistAppointment == null ? that.fblnAssistAppointment == null : this.fblnAssistAppointment.equals(that.fblnAssistAppointment));
    equal = equal && (this.fblnAssistIRDApp == null ? that.fblnAssistIRDApp == null : this.fblnAssistIRDApp.equals(that.fblnAssistIRDApp));
    equal = equal && (this.fblnAssistPickUp == null ? that.fblnAssistPickUp == null : this.fblnAssistPickUp.equals(that.fblnAssistPickUp));
    equal = equal && (this.fblnAssistReview == null ? that.fblnAssistReview == null : this.fblnAssistReview.equals(that.fblnAssistReview));
    equal = equal && (this.fblnEduBusInc == null ? that.fblnEduBusInc == null : this.fblnEduBusInc.equals(that.fblnEduBusInc));
    equal = equal && (this.fblnEduCS == null ? that.fblnEduCS == null : this.fblnEduCS.equals(that.fblnEduCS));
    equal = equal && (this.fblnEduEmployer == null ? that.fblnEduEmployer == null : this.fblnEduEmployer.equals(that.fblnEduEmployer));
    equal = equal && (this.fblnEduGST == null ? that.fblnEduGST == null : this.fblnEduGST.equals(that.fblnEduGST));
    equal = equal && (this.fblnEduFam == null ? that.fblnEduFam == null : this.fblnEduFam.equals(that.fblnEduFam));
    equal = equal && (this.fblnEduKiwisaver == null ? that.fblnEduKiwisaver == null : this.fblnEduKiwisaver.equals(that.fblnEduKiwisaver));
    equal = equal && (this.fblnEduPPL == null ? that.fblnEduPPL == null : this.fblnEduPPL.equals(that.fblnEduPPL));
    equal = equal && (this.fblnEduRebate == null ? that.fblnEduRebate == null : this.fblnEduRebate.equals(that.fblnEduRebate));
    equal = equal && (this.fblnEduReturns == null ? that.fblnEduReturns == null : this.fblnEduReturns.equals(that.fblnEduReturns));
    equal = equal && (this.fblnEduSLS == null ? that.fblnEduSLS == null : this.fblnEduSLS.equals(that.fblnEduSLS));
    equal = equal && (this.fblnEduSW == null ? that.fblnEduSW == null : this.fblnEduSW.equals(that.fblnEduSW));
    equal = equal && (this.fblnEduTaxAgent == null ? that.fblnEduTaxAgent == null : this.fblnEduTaxAgent.equals(that.fblnEduTaxAgent));
    equal = equal && (this.fblnUpdIRD == null ? that.fblnUpdIRD == null : this.fblnUpdIRD.equals(that.fblnUpdIRD));
    equal = equal && (this.fblnUpdInfo == null ? that.fblnUpdInfo == null : this.fblnUpdInfo.equals(that.fblnUpdInfo));
    equal = equal && (this.fblnUpdInc == null ? that.fblnUpdInc == null : this.fblnUpdInc.equals(that.fblnUpdInc));
    equal = equal && (this.fblnReDropBox == null ? that.fblnReDropBox == null : this.fblnReDropBox.equals(that.fblnReDropBox));
    equal = equal && (this.fblnReMyIR == null ? that.fblnReMyIR == null : this.fblnReMyIR.equals(that.fblnReMyIR));
    equal = equal && (this.fblnReOtherOrg == null ? that.fblnReOtherOrg == null : this.fblnReOtherOrg.equals(that.fblnReOtherOrg));
    equal = equal && (this.fblnRePhones == null ? that.fblnRePhones == null : this.fblnRePhones.equals(that.fblnRePhones));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof tblnz_visitfrontofhouse)) {
      return false;
    }
    tblnz_visitfrontofhouse that = (tblnz_visitfrontofhouse) o;
    boolean equal = true;
    equal = equal && (this.flngDocKey == null ? that.flngDocKey == null : this.flngDocKey.equals(that.flngDocKey));
    equal = equal && (this.flngNumberOfCustomers == null ? that.flngNumberOfCustomers == null : this.flngNumberOfCustomers.equals(that.flngNumberOfCustomers));
    equal = equal && (this.fblnAssistAppointment == null ? that.fblnAssistAppointment == null : this.fblnAssistAppointment.equals(that.fblnAssistAppointment));
    equal = equal && (this.fblnAssistIRDApp == null ? that.fblnAssistIRDApp == null : this.fblnAssistIRDApp.equals(that.fblnAssistIRDApp));
    equal = equal && (this.fblnAssistPickUp == null ? that.fblnAssistPickUp == null : this.fblnAssistPickUp.equals(that.fblnAssistPickUp));
    equal = equal && (this.fblnAssistReview == null ? that.fblnAssistReview == null : this.fblnAssistReview.equals(that.fblnAssistReview));
    equal = equal && (this.fblnEduBusInc == null ? that.fblnEduBusInc == null : this.fblnEduBusInc.equals(that.fblnEduBusInc));
    equal = equal && (this.fblnEduCS == null ? that.fblnEduCS == null : this.fblnEduCS.equals(that.fblnEduCS));
    equal = equal && (this.fblnEduEmployer == null ? that.fblnEduEmployer == null : this.fblnEduEmployer.equals(that.fblnEduEmployer));
    equal = equal && (this.fblnEduGST == null ? that.fblnEduGST == null : this.fblnEduGST.equals(that.fblnEduGST));
    equal = equal && (this.fblnEduFam == null ? that.fblnEduFam == null : this.fblnEduFam.equals(that.fblnEduFam));
    equal = equal && (this.fblnEduKiwisaver == null ? that.fblnEduKiwisaver == null : this.fblnEduKiwisaver.equals(that.fblnEduKiwisaver));
    equal = equal && (this.fblnEduPPL == null ? that.fblnEduPPL == null : this.fblnEduPPL.equals(that.fblnEduPPL));
    equal = equal && (this.fblnEduRebate == null ? that.fblnEduRebate == null : this.fblnEduRebate.equals(that.fblnEduRebate));
    equal = equal && (this.fblnEduReturns == null ? that.fblnEduReturns == null : this.fblnEduReturns.equals(that.fblnEduReturns));
    equal = equal && (this.fblnEduSLS == null ? that.fblnEduSLS == null : this.fblnEduSLS.equals(that.fblnEduSLS));
    equal = equal && (this.fblnEduSW == null ? that.fblnEduSW == null : this.fblnEduSW.equals(that.fblnEduSW));
    equal = equal && (this.fblnEduTaxAgent == null ? that.fblnEduTaxAgent == null : this.fblnEduTaxAgent.equals(that.fblnEduTaxAgent));
    equal = equal && (this.fblnUpdIRD == null ? that.fblnUpdIRD == null : this.fblnUpdIRD.equals(that.fblnUpdIRD));
    equal = equal && (this.fblnUpdInfo == null ? that.fblnUpdInfo == null : this.fblnUpdInfo.equals(that.fblnUpdInfo));
    equal = equal && (this.fblnUpdInc == null ? that.fblnUpdInc == null : this.fblnUpdInc.equals(that.fblnUpdInc));
    equal = equal && (this.fblnReDropBox == null ? that.fblnReDropBox == null : this.fblnReDropBox.equals(that.fblnReDropBox));
    equal = equal && (this.fblnReMyIR == null ? that.fblnReMyIR == null : this.fblnReMyIR.equals(that.fblnReMyIR));
    equal = equal && (this.fblnReOtherOrg == null ? that.fblnReOtherOrg == null : this.fblnReOtherOrg.equals(that.fblnReOtherOrg));
    equal = equal && (this.fblnRePhones == null ? that.fblnRePhones == null : this.fblnRePhones.equals(that.fblnRePhones));
    equal = equal && (this.fstrWho == null ? that.fstrWho == null : this.fstrWho.equals(that.fstrWho));
    equal = equal && (this.fdtmWhen == null ? that.fdtmWhen == null : this.fdtmWhen.equals(that.fdtmWhen));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngNumberOfCustomers = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnAssistAppointment = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnAssistIRDApp = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnAssistPickUp = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fblnAssistReview = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnEduBusInc = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnEduCS = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnEduEmployer = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnEduGST = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnEduFam = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnEduKiwisaver = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnEduPPL = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnEduRebate = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnEduReturns = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnEduSLS = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnEduSW = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnEduTaxAgent = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnUpdIRD = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnUpdInfo = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnUpdInc = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnReDropBox = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fblnReMyIR = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnReOtherOrg = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fblnRePhones = JdbcWritableBridge.readInteger(25, __dbResults);
    this.fstrWho = JdbcWritableBridge.readString(26, __dbResults);
    this.fdtmWhen = JdbcWritableBridge.readTimestamp(27, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.flngDocKey = JdbcWritableBridge.readInteger(1, __dbResults);
    this.flngNumberOfCustomers = JdbcWritableBridge.readInteger(2, __dbResults);
    this.fblnAssistAppointment = JdbcWritableBridge.readInteger(3, __dbResults);
    this.fblnAssistIRDApp = JdbcWritableBridge.readInteger(4, __dbResults);
    this.fblnAssistPickUp = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fblnAssistReview = JdbcWritableBridge.readInteger(6, __dbResults);
    this.fblnEduBusInc = JdbcWritableBridge.readInteger(7, __dbResults);
    this.fblnEduCS = JdbcWritableBridge.readInteger(8, __dbResults);
    this.fblnEduEmployer = JdbcWritableBridge.readInteger(9, __dbResults);
    this.fblnEduGST = JdbcWritableBridge.readInteger(10, __dbResults);
    this.fblnEduFam = JdbcWritableBridge.readInteger(11, __dbResults);
    this.fblnEduKiwisaver = JdbcWritableBridge.readInteger(12, __dbResults);
    this.fblnEduPPL = JdbcWritableBridge.readInteger(13, __dbResults);
    this.fblnEduRebate = JdbcWritableBridge.readInteger(14, __dbResults);
    this.fblnEduReturns = JdbcWritableBridge.readInteger(15, __dbResults);
    this.fblnEduSLS = JdbcWritableBridge.readInteger(16, __dbResults);
    this.fblnEduSW = JdbcWritableBridge.readInteger(17, __dbResults);
    this.fblnEduTaxAgent = JdbcWritableBridge.readInteger(18, __dbResults);
    this.fblnUpdIRD = JdbcWritableBridge.readInteger(19, __dbResults);
    this.fblnUpdInfo = JdbcWritableBridge.readInteger(20, __dbResults);
    this.fblnUpdInc = JdbcWritableBridge.readInteger(21, __dbResults);
    this.fblnReDropBox = JdbcWritableBridge.readInteger(22, __dbResults);
    this.fblnReMyIR = JdbcWritableBridge.readInteger(23, __dbResults);
    this.fblnReOtherOrg = JdbcWritableBridge.readInteger(24, __dbResults);
    this.fblnRePhones = JdbcWritableBridge.readInteger(25, __dbResults);
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
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngNumberOfCustomers, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAssistAppointment, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAssistIRDApp, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAssistPickUp, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAssistReview, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduBusInc, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduCS, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduEmployer, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduGST, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduFam, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduKiwisaver, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduPPL, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduRebate, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduReturns, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduSLS, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduSW, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduTaxAgent, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUpdIRD, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUpdInfo, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUpdInc, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReDropBox, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReMyIR, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReOtherOrg, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRePhones, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
    return 27;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(flngDocKey, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flngNumberOfCustomers, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAssistAppointment, 3 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAssistIRDApp, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAssistPickUp, 5 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnAssistReview, 6 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduBusInc, 7 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduCS, 8 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduEmployer, 9 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduGST, 10 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduFam, 11 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduKiwisaver, 12 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduPPL, 13 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduRebate, 14 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduReturns, 15 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduSLS, 16 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduSW, 17 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnEduTaxAgent, 18 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUpdIRD, 19 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUpdInfo, 20 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnUpdInc, 21 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReDropBox, 22 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReMyIR, 23 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnReOtherOrg, 24 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeInteger(fblnRePhones, 25 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeString(fstrWho, 26 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeTimestamp(fdtmWhen, 27 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.flngDocKey = null;
    } else {
    this.flngDocKey = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flngNumberOfCustomers = null;
    } else {
    this.flngNumberOfCustomers = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAssistAppointment = null;
    } else {
    this.fblnAssistAppointment = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAssistIRDApp = null;
    } else {
    this.fblnAssistIRDApp = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAssistPickUp = null;
    } else {
    this.fblnAssistPickUp = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnAssistReview = null;
    } else {
    this.fblnAssistReview = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEduBusInc = null;
    } else {
    this.fblnEduBusInc = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEduCS = null;
    } else {
    this.fblnEduCS = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEduEmployer = null;
    } else {
    this.fblnEduEmployer = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEduGST = null;
    } else {
    this.fblnEduGST = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEduFam = null;
    } else {
    this.fblnEduFam = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEduKiwisaver = null;
    } else {
    this.fblnEduKiwisaver = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEduPPL = null;
    } else {
    this.fblnEduPPL = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEduRebate = null;
    } else {
    this.fblnEduRebate = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEduReturns = null;
    } else {
    this.fblnEduReturns = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEduSLS = null;
    } else {
    this.fblnEduSLS = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEduSW = null;
    } else {
    this.fblnEduSW = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnEduTaxAgent = null;
    } else {
    this.fblnEduTaxAgent = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnUpdIRD = null;
    } else {
    this.fblnUpdIRD = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnUpdInfo = null;
    } else {
    this.fblnUpdInfo = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnUpdInc = null;
    } else {
    this.fblnUpdInc = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnReDropBox = null;
    } else {
    this.fblnReDropBox = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnReMyIR = null;
    } else {
    this.fblnReMyIR = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnReOtherOrg = null;
    } else {
    this.fblnReOtherOrg = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fblnRePhones = null;
    } else {
    this.fblnRePhones = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngNumberOfCustomers) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNumberOfCustomers);
    }
    if (null == this.fblnAssistAppointment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAssistAppointment);
    }
    if (null == this.fblnAssistIRDApp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAssistIRDApp);
    }
    if (null == this.fblnAssistPickUp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAssistPickUp);
    }
    if (null == this.fblnAssistReview) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAssistReview);
    }
    if (null == this.fblnEduBusInc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduBusInc);
    }
    if (null == this.fblnEduCS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduCS);
    }
    if (null == this.fblnEduEmployer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduEmployer);
    }
    if (null == this.fblnEduGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduGST);
    }
    if (null == this.fblnEduFam) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduFam);
    }
    if (null == this.fblnEduKiwisaver) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduKiwisaver);
    }
    if (null == this.fblnEduPPL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduPPL);
    }
    if (null == this.fblnEduRebate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduRebate);
    }
    if (null == this.fblnEduReturns) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduReturns);
    }
    if (null == this.fblnEduSLS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduSLS);
    }
    if (null == this.fblnEduSW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduSW);
    }
    if (null == this.fblnEduTaxAgent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduTaxAgent);
    }
    if (null == this.fblnUpdIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUpdIRD);
    }
    if (null == this.fblnUpdInfo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUpdInfo);
    }
    if (null == this.fblnUpdInc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUpdInc);
    }
    if (null == this.fblnReDropBox) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReDropBox);
    }
    if (null == this.fblnReMyIR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReMyIR);
    }
    if (null == this.fblnReOtherOrg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReOtherOrg);
    }
    if (null == this.fblnRePhones) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRePhones);
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
    if (null == this.flngDocKey) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngDocKey);
    }
    if (null == this.flngNumberOfCustomers) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flngNumberOfCustomers);
    }
    if (null == this.fblnAssistAppointment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAssistAppointment);
    }
    if (null == this.fblnAssistIRDApp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAssistIRDApp);
    }
    if (null == this.fblnAssistPickUp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAssistPickUp);
    }
    if (null == this.fblnAssistReview) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnAssistReview);
    }
    if (null == this.fblnEduBusInc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduBusInc);
    }
    if (null == this.fblnEduCS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduCS);
    }
    if (null == this.fblnEduEmployer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduEmployer);
    }
    if (null == this.fblnEduGST) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduGST);
    }
    if (null == this.fblnEduFam) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduFam);
    }
    if (null == this.fblnEduKiwisaver) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduKiwisaver);
    }
    if (null == this.fblnEduPPL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduPPL);
    }
    if (null == this.fblnEduRebate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduRebate);
    }
    if (null == this.fblnEduReturns) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduReturns);
    }
    if (null == this.fblnEduSLS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduSLS);
    }
    if (null == this.fblnEduSW) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduSW);
    }
    if (null == this.fblnEduTaxAgent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnEduTaxAgent);
    }
    if (null == this.fblnUpdIRD) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUpdIRD);
    }
    if (null == this.fblnUpdInfo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUpdInfo);
    }
    if (null == this.fblnUpdInc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnUpdInc);
    }
    if (null == this.fblnReDropBox) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReDropBox);
    }
    if (null == this.fblnReMyIR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReMyIR);
    }
    if (null == this.fblnReOtherOrg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnReOtherOrg);
    }
    if (null == this.fblnRePhones) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fblnRePhones);
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngNumberOfCustomers==null?"\\N":"" + flngNumberOfCustomers, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAssistAppointment==null?"\\N":"" + fblnAssistAppointment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAssistIRDApp==null?"\\N":"" + fblnAssistIRDApp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAssistPickUp==null?"\\N":"" + fblnAssistPickUp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAssistReview==null?"\\N":"" + fblnAssistReview, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduBusInc==null?"\\N":"" + fblnEduBusInc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduCS==null?"\\N":"" + fblnEduCS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduEmployer==null?"\\N":"" + fblnEduEmployer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduGST==null?"\\N":"" + fblnEduGST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduFam==null?"\\N":"" + fblnEduFam, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduKiwisaver==null?"\\N":"" + fblnEduKiwisaver, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduPPL==null?"\\N":"" + fblnEduPPL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduRebate==null?"\\N":"" + fblnEduRebate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduReturns==null?"\\N":"" + fblnEduReturns, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduSLS==null?"\\N":"" + fblnEduSLS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduSW==null?"\\N":"" + fblnEduSW, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduTaxAgent==null?"\\N":"" + fblnEduTaxAgent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUpdIRD==null?"\\N":"" + fblnUpdIRD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUpdInfo==null?"\\N":"" + fblnUpdInfo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUpdInc==null?"\\N":"" + fblnUpdInc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReDropBox==null?"\\N":"" + fblnReDropBox, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReMyIR==null?"\\N":"" + fblnReMyIR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReOtherOrg==null?"\\N":"" + fblnReOtherOrg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRePhones==null?"\\N":"" + fblnRePhones, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(flngDocKey==null?"\\N":"" + flngDocKey, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flngNumberOfCustomers==null?"\\N":"" + flngNumberOfCustomers, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAssistAppointment==null?"\\N":"" + fblnAssistAppointment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAssistIRDApp==null?"\\N":"" + fblnAssistIRDApp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAssistPickUp==null?"\\N":"" + fblnAssistPickUp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnAssistReview==null?"\\N":"" + fblnAssistReview, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduBusInc==null?"\\N":"" + fblnEduBusInc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduCS==null?"\\N":"" + fblnEduCS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduEmployer==null?"\\N":"" + fblnEduEmployer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduGST==null?"\\N":"" + fblnEduGST, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduFam==null?"\\N":"" + fblnEduFam, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduKiwisaver==null?"\\N":"" + fblnEduKiwisaver, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduPPL==null?"\\N":"" + fblnEduPPL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduRebate==null?"\\N":"" + fblnEduRebate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduReturns==null?"\\N":"" + fblnEduReturns, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduSLS==null?"\\N":"" + fblnEduSLS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduSW==null?"\\N":"" + fblnEduSW, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnEduTaxAgent==null?"\\N":"" + fblnEduTaxAgent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUpdIRD==null?"\\N":"" + fblnUpdIRD, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUpdInfo==null?"\\N":"" + fblnUpdInfo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnUpdInc==null?"\\N":"" + fblnUpdInc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReDropBox==null?"\\N":"" + fblnReDropBox, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReMyIR==null?"\\N":"" + fblnReMyIR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnReOtherOrg==null?"\\N":"" + fblnReOtherOrg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fblnRePhones==null?"\\N":"" + fblnRePhones, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngNumberOfCustomers = null; } else {
      this.flngNumberOfCustomers = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAssistAppointment = null; } else {
      this.fblnAssistAppointment = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAssistIRDApp = null; } else {
      this.fblnAssistIRDApp = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAssistPickUp = null; } else {
      this.fblnAssistPickUp = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAssistReview = null; } else {
      this.fblnAssistReview = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduBusInc = null; } else {
      this.fblnEduBusInc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduCS = null; } else {
      this.fblnEduCS = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduEmployer = null; } else {
      this.fblnEduEmployer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduGST = null; } else {
      this.fblnEduGST = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduFam = null; } else {
      this.fblnEduFam = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduKiwisaver = null; } else {
      this.fblnEduKiwisaver = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduPPL = null; } else {
      this.fblnEduPPL = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduRebate = null; } else {
      this.fblnEduRebate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduReturns = null; } else {
      this.fblnEduReturns = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduSLS = null; } else {
      this.fblnEduSLS = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduSW = null; } else {
      this.fblnEduSW = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduTaxAgent = null; } else {
      this.fblnEduTaxAgent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUpdIRD = null; } else {
      this.fblnUpdIRD = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUpdInfo = null; } else {
      this.fblnUpdInfo = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUpdInc = null; } else {
      this.fblnUpdInc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReDropBox = null; } else {
      this.fblnReDropBox = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReMyIR = null; } else {
      this.fblnReMyIR = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReOtherOrg = null; } else {
      this.fblnReOtherOrg = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRePhones = null; } else {
      this.fblnRePhones = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngDocKey = null; } else {
      this.flngDocKey = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flngNumberOfCustomers = null; } else {
      this.flngNumberOfCustomers = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAssistAppointment = null; } else {
      this.fblnAssistAppointment = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAssistIRDApp = null; } else {
      this.fblnAssistIRDApp = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAssistPickUp = null; } else {
      this.fblnAssistPickUp = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnAssistReview = null; } else {
      this.fblnAssistReview = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduBusInc = null; } else {
      this.fblnEduBusInc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduCS = null; } else {
      this.fblnEduCS = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduEmployer = null; } else {
      this.fblnEduEmployer = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduGST = null; } else {
      this.fblnEduGST = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduFam = null; } else {
      this.fblnEduFam = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduKiwisaver = null; } else {
      this.fblnEduKiwisaver = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduPPL = null; } else {
      this.fblnEduPPL = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduRebate = null; } else {
      this.fblnEduRebate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduReturns = null; } else {
      this.fblnEduReturns = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduSLS = null; } else {
      this.fblnEduSLS = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduSW = null; } else {
      this.fblnEduSW = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnEduTaxAgent = null; } else {
      this.fblnEduTaxAgent = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUpdIRD = null; } else {
      this.fblnUpdIRD = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUpdInfo = null; } else {
      this.fblnUpdInfo = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnUpdInc = null; } else {
      this.fblnUpdInc = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReDropBox = null; } else {
      this.fblnReDropBox = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReMyIR = null; } else {
      this.fblnReMyIR = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnReOtherOrg = null; } else {
      this.fblnReOtherOrg = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fblnRePhones = null; } else {
      this.fblnRePhones = Integer.valueOf(__cur_str);
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
    tblnz_visitfrontofhouse o = (tblnz_visitfrontofhouse) super.clone();
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
    return o;
  }

  public void clone0(tblnz_visitfrontofhouse o) throws CloneNotSupportedException {
    o.fdtmWhen = (o.fdtmWhen != null) ? (java.sql.Timestamp) o.fdtmWhen.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngNumberOfCustomers", this.flngNumberOfCustomers);
    __sqoop$field_map.put("fblnAssistAppointment", this.fblnAssistAppointment);
    __sqoop$field_map.put("fblnAssistIRDApp", this.fblnAssistIRDApp);
    __sqoop$field_map.put("fblnAssistPickUp", this.fblnAssistPickUp);
    __sqoop$field_map.put("fblnAssistReview", this.fblnAssistReview);
    __sqoop$field_map.put("fblnEduBusInc", this.fblnEduBusInc);
    __sqoop$field_map.put("fblnEduCS", this.fblnEduCS);
    __sqoop$field_map.put("fblnEduEmployer", this.fblnEduEmployer);
    __sqoop$field_map.put("fblnEduGST", this.fblnEduGST);
    __sqoop$field_map.put("fblnEduFam", this.fblnEduFam);
    __sqoop$field_map.put("fblnEduKiwisaver", this.fblnEduKiwisaver);
    __sqoop$field_map.put("fblnEduPPL", this.fblnEduPPL);
    __sqoop$field_map.put("fblnEduRebate", this.fblnEduRebate);
    __sqoop$field_map.put("fblnEduReturns", this.fblnEduReturns);
    __sqoop$field_map.put("fblnEduSLS", this.fblnEduSLS);
    __sqoop$field_map.put("fblnEduSW", this.fblnEduSW);
    __sqoop$field_map.put("fblnEduTaxAgent", this.fblnEduTaxAgent);
    __sqoop$field_map.put("fblnUpdIRD", this.fblnUpdIRD);
    __sqoop$field_map.put("fblnUpdInfo", this.fblnUpdInfo);
    __sqoop$field_map.put("fblnUpdInc", this.fblnUpdInc);
    __sqoop$field_map.put("fblnReDropBox", this.fblnReDropBox);
    __sqoop$field_map.put("fblnReMyIR", this.fblnReMyIR);
    __sqoop$field_map.put("fblnReOtherOrg", this.fblnReOtherOrg);
    __sqoop$field_map.put("fblnRePhones", this.fblnRePhones);
    __sqoop$field_map.put("fstrWho", this.fstrWho);
    __sqoop$field_map.put("fdtmWhen", this.fdtmWhen);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("flngDocKey", this.flngDocKey);
    __sqoop$field_map.put("flngNumberOfCustomers", this.flngNumberOfCustomers);
    __sqoop$field_map.put("fblnAssistAppointment", this.fblnAssistAppointment);
    __sqoop$field_map.put("fblnAssistIRDApp", this.fblnAssistIRDApp);
    __sqoop$field_map.put("fblnAssistPickUp", this.fblnAssistPickUp);
    __sqoop$field_map.put("fblnAssistReview", this.fblnAssistReview);
    __sqoop$field_map.put("fblnEduBusInc", this.fblnEduBusInc);
    __sqoop$field_map.put("fblnEduCS", this.fblnEduCS);
    __sqoop$field_map.put("fblnEduEmployer", this.fblnEduEmployer);
    __sqoop$field_map.put("fblnEduGST", this.fblnEduGST);
    __sqoop$field_map.put("fblnEduFam", this.fblnEduFam);
    __sqoop$field_map.put("fblnEduKiwisaver", this.fblnEduKiwisaver);
    __sqoop$field_map.put("fblnEduPPL", this.fblnEduPPL);
    __sqoop$field_map.put("fblnEduRebate", this.fblnEduRebate);
    __sqoop$field_map.put("fblnEduReturns", this.fblnEduReturns);
    __sqoop$field_map.put("fblnEduSLS", this.fblnEduSLS);
    __sqoop$field_map.put("fblnEduSW", this.fblnEduSW);
    __sqoop$field_map.put("fblnEduTaxAgent", this.fblnEduTaxAgent);
    __sqoop$field_map.put("fblnUpdIRD", this.fblnUpdIRD);
    __sqoop$field_map.put("fblnUpdInfo", this.fblnUpdInfo);
    __sqoop$field_map.put("fblnUpdInc", this.fblnUpdInc);
    __sqoop$field_map.put("fblnReDropBox", this.fblnReDropBox);
    __sqoop$field_map.put("fblnReMyIR", this.fblnReMyIR);
    __sqoop$field_map.put("fblnReOtherOrg", this.fblnReOtherOrg);
    __sqoop$field_map.put("fblnRePhones", this.fblnRePhones);
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
