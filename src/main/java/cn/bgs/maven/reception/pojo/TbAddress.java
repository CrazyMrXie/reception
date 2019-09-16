package cn.bgs.maven.reception.pojo;


public class TbAddress {

  private Integer id;
  private String name;
  private Integer level;
  private Integer pId;
  private Integer isParent;
  private String code;


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Integer getIsParent() {
    return isParent;
  }

  public void setIsParent(Integer isParent) {
    this.isParent = isParent;
  }

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


  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public Integer getPId() {
    return pId;
  }

  public void setPId(Integer pId) {
    this.pId = pId;
  }

  @Override
  public String toString() {
    return "TbAddress{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", level=" + level +
            ", pId=" + pId +
            ", isParent=" + isParent +
            ", code='" + code + '\'' +
            '}';
  }

  public TbAddress(Integer id, String name, Integer level, Integer pId, Integer isParent, String code) {
    this.id = id;
    this.name = name;
    this.level = level;
    this.pId = pId;
    this.isParent = isParent;
    this.code = code;
  }

  public TbAddress() {
  }
}
