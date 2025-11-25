INSERT INTO ORDERS (id, customer_name, created_at)
VALUES ('00000000-0000-0000-0000-000000000000'::uuid, 'Opniscience', NOW());

INSERT INTO ORDER_ITEMS (id, product, quantity, unit_price, order_id)
VALUES ('00000000-0000-0000-0001-000000000000'::uuid, 'Example 1', 5, 34.567,
        '00000000-0000-0000-0000-000000000000'::uuid);