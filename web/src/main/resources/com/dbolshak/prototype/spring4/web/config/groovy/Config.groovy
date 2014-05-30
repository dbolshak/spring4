beans {
    dataSource(org.apache.commons.dbcp.BasicDataSource) {
        driverClassName = 'org.hsqldb.jdbcDriver'
        url             = 'jdbc:hsqldb:mem:db'
        username        = 'sa'
        password        = ''
    }

    bootstrap(Bootstrap) { bean ->
        bean.initMethod = 'init'

        dataSource = ref('dataSource')
    }
}