package com.sybinal.shop.model;

/*广告管理   advertise
* */
public class Advertise {
    private Integer id;
    private  String name;
    private Integer seqno;
    private  String url;
    private  String   img;
    private   Integer  category_id;
    private  Integer   index_flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeqno() {
        return seqno;
    }

    public void setSeqno(Integer seqno) {
        this.seqno = seqno;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Integer getIndex_flag() {
        return index_flag;
    }

    public void setIndex_flag(Integer index_flag) {
        this.index_flag = index_flag;
    }

    @Override
    public String toString() {
        return "Advertise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seqno=" + seqno +
                ", url='" + url + '\'' +
                ", img='" + img + '\'' +
                ", category_id=" + category_id +
                ", index_flag=" + index_flag +
                '}';
    }
}
