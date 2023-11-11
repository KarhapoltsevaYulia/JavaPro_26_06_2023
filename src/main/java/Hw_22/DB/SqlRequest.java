package Hw_22.DB;

public enum SqlRequest {

        ADDRECORD("INSERT INTO TableRecord (id,data) values (?,?);");

        private final String nameSqlRequest;

        SqlRequest(String nameSqlRequest) {
            this.nameSqlRequest = nameSqlRequest;
        }

        public String getNameSqlRequest() {
            return nameSqlRequest;
        }

        @Override
        public String toString() {
            return "SQLrequest{" +
                    "nameSqlRequest='" + nameSqlRequest + '\'' +
                    '}';
        }

}
