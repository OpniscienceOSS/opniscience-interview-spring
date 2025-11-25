CREATE TABLE order_items
(
    id         UUID             NOT NULL,
    product    VARCHAR(255),
    quantity   INT              NOT NULL,
    unit_price DOUBLE PRECISION NOT NULL,
    order_id   UUID,
    CONSTRAINT pk_order_items PRIMARY KEY (id)
);

CREATE TABLE orders
(
    id            UUID NOT NULL,
    customer_name VARCHAR(255),
    created_at    TIMESTAMP,
    CONSTRAINT pk_orders PRIMARY KEY (id)
);

ALTER TABLE order_items
    ADD CONSTRAINT FK_ORDER_ITEMS_ON_ORDER FOREIGN KEY (order_id) REFERENCES orders (id);