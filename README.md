# technical_assessment
Technical assessment for Tech Lead role

This application when running can be accessed via http://localhost:9001/Orders/Create




This can be tested in postman using the below request payload:

{
    "totalamount": 0,
    "netpayableamount": 0,
    "customer": {
        "firstname": "solo",
        "lastname": "Hek",
        "email": "Hek@gmail.com",
        "phonenumber": "00488474",
        "address": "uuuu",
        "usertype": "employee"
    },
    "dateorderded": "2024",
    "paymentmethod": "VISA",
    "Pickuplocation": "12345678002",
    "orderdescription": "",
    "products": [
        {
            "productid": "prod1",
            "prodcutname": "food1",
            "description": "oooeeooeo",
            "unitprice": 10,
            "quantity": 7,
            "totalamout": 0,
            "category":"groceries"
        },
        {
            "productid": "prod2",
            "prodcutname": "food2",
            "description": "oooeeooeo",
            "unitprice": 15,
            "quantity": 3,
            "totalamout": 0,
            "category":"electronic"
        }
    ]
}









