package cn.mrcode.cache.eshop.datasyncserver.rabbitmq;

/**
 * 商品事件
 *
 * @author : zhuqiang
 * @date : 2019/9/1 18:14
 */
public class ProductEvent {
    private String eventType;
    private String dataType;
    private Long id;
    private Long productId;

    public ProductEvent() {
    }

    public ProductEvent(String eventType, String dataType, Long id) {
        this.eventType = eventType;
        this.dataType = dataType;
        this.id = id;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
