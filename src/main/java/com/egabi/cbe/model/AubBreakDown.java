package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the AUB_BREAK_DOWN database table.
 * 
 */
@Entity
@Table(name="AUB_BREAK_DOWN")
@NamedQuery(name="AubBreakDown.findAll", query="SELECT a FROM AubBreakDown a")
public class AubBreakDown implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


	@Column(name="A_C")
	private BigDecimal aC;

	private BigDecimal alloc;

	@Column(name="AMT_IN_USD_K")
	private BigDecimal amtInUsdK;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CATEGORY_CODE")
	private BigDecimal categoryCode;

	private BigDecimal cbe;

	private BigDecimal comm;

	@Column(name="E_O_W")
	private BigDecimal eOW;

	private String goods;

	@Column(name="GOODS_TYPE")
	private BigDecimal goodsType;

	@Column(name="IDC_REF")
	private String idcRef;

	private String maturity;

	private String name;

	@Column(name="\"NEW\"")
	private String new_;

	public AubBreakDown() {
	}

	public BigDecimal getAC() {
		return this.aC;
	}

	public void setAC(BigDecimal aC) {
		this.aC = aC;
	}

	public BigDecimal getAlloc() {
		return this.alloc;
	}

	public void setAlloc(BigDecimal alloc) {
		this.alloc = alloc;
	}

	public BigDecimal getAmtInUsdK() {
		return this.amtInUsdK;
	}

	public void setAmtInUsdK(BigDecimal amtInUsdK) {
		this.amtInUsdK = amtInUsdK;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public BigDecimal getCategoryCode() {
		return this.categoryCode;
	}

	public void setCategoryCode(BigDecimal categoryCode) {
		this.categoryCode = categoryCode;
	}

	public BigDecimal getCbe() {
		return this.cbe;
	}

	public void setCbe(BigDecimal cbe) {
		this.cbe = cbe;
	}

	public BigDecimal getComm() {
		return this.comm;
	}

	public void setComm(BigDecimal comm) {
		this.comm = comm;
	}

	public BigDecimal getEOW() {
		return this.eOW;
	}

	public void setEOW(BigDecimal eOW) {
		this.eOW = eOW;
	}

	public String getGoods() {
		return this.goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}

	public BigDecimal getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(BigDecimal goodsType) {
		this.goodsType = goodsType;
	}

	public String getIdcRef() {
		return this.idcRef;
	}

	public void setIdcRef(String idcRef) {
		this.idcRef = idcRef;
	}

	public String getMaturity() {
		return this.maturity;
	}

	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNew_() {
		return this.new_;
	}

	public void setNew_(String new_) {
		this.new_ = new_;
	}

}