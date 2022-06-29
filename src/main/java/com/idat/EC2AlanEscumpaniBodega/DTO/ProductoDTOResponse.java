package com.idat.EC2AlanEscumpaniBodega.DTO;

public class ProductoDTOResponse {
	
	private Integer id;
	private String Nombreproducto;
	private String descripcionProducto;
	private Integer precioProducto;
	private Integer stockProducto;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreproducto() {
		return Nombreproducto;
	}
	public void setNombreproducto(String nombreproducto) {
		Nombreproducto = nombreproducto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public Integer getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(Integer precioProducto) {
		this.precioProducto = precioProducto;
	}
	public Integer getStockProducto() {
		return stockProducto;
	}
	public void setStockProducto(Integer stockProducto) {
		this.stockProducto = stockProducto;
	}
	
	

}
