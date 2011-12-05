grails.doc.authors = 'Jeff Brown, Peter Ledbrook'
grails.doc.license = 'Apache License 2.0'
grails.doc.title = 'RabbitMQ Plugin'

environments {
    test {
        rabbitmq {
            connectionfactory {
                username = 'guest'
                password = 'guest'
                hostname = 'localhost'
            }
        }
    }
}
