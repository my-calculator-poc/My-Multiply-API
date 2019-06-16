package contracts

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'POST'
        url '/multiply'
        body([
                number1: 2,
                number2: 3
        ])
        headers {
            contentType('application/json')
        }
    }
    response {
        status OK()
        body("6")
        headers {
            contentType('application/json')
        }
    }
}