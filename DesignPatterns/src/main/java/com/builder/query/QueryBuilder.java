package com.builder.query;

@WithBuilder
public class QueryBuilder {
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    private QueryBuilder(QBuilder builder) {
        this.select = builder.select;
        this.from = builder.from;
        this.where = builder.where;
        this.join = builder.join;
        this.orderBy = builder.orderBy;
        this.groupBy = builder.groupBy;
    }

    public static QBuilder getBuilder() {
        return new QBuilder();
    }

    public static class QBuilder {
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public String getSelect() {
            return select;
        }

        public String getFrom() {
            return from;
        }

        public String getWhere() {
            return where;
        }

        public String getJoin() {
            return join;
        }

        public String getOrderBy() {
            return orderBy;
        }

        public String getGroupBy() {
            return groupBy;
        }

        public QBuilder setSelect(String select) {
            this.select = select;
            return this;
        }
        public QBuilder setFrom(String from) {
            this.from = from;
            return this;
        }
        public QBuilder setWhere(String where) {
            this.where = where;
            return this;
        }
        public QBuilder setJoin(String join) {
            this.join = join;
            return this;
        }
        public QBuilder setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
        public QBuilder setGroupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }
        private QBuilder(){

        }

        public QueryBuilder build() {
            return new QueryBuilder(this);
        }
    }
}
