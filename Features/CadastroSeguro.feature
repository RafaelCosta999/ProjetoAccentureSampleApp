# language: pt
Funcionalidade: Cadastro Seguro Veicular

  Esquema do Cenario: CT001 - Realizar solicitacao de seguro de veiculos
    Dado que abro o navegador Chrome
    Quando abro a URL "http://sampleapp.tricentis.com/101/app.php"
    E preencho os dados do veiculo com <newMarca> e <newModel> e <newCylinder> e <newEnginer> e <newDataFabri> e <newNumber> e <newHand> e <newFuel> e <newPayload> e <newWeight> e <newPrice> e <newLicense> e <newMileage>
    E clico em avancar para dados do seguro
    E preencho os dados do seguro <firtsName> e <lastName> e <birth> e <gender> e <andress> e <country> e <zipCode> e <city> e <occupation> e <hobbies> e <hobbies2> e <site>
    E clico em avancar para dados do produto
    E insiro os dados do produto <startDate> e <insuranceSum> e <MeritRating> e <DamageInsurance> e <optionalProducts> e <courtesyCar>
    E clico em avancar para opcao de preco
    E seleciono a opcao de preco <priceOption>
    E clico para avancar para envio de cotacao
    E preencho os dados finais da cotacao <email> e <phone> e <userName> e <password> e <confirmPassword> e <comments>
    E clico em enviar cotacao
    Entao valido o envio realizado com sucesso
    
    
    Exemplos:
    | newMarca | newModel   | newCylinder | newEnginer | newDataFabri | newNumber | newHand | newFuel  |newPayload | newWeight | newPrice | newLicense  | newMileage | firtsName | lastName | birth        | gender | andress            | country  | zipCode    | city      | occupation | hobbies  | hobbies2    | site                                         | startDate    | insuranceSum   | MeritRating | DamageInsurance | optionalProducts | courtesyCar | priceOption | email                | phone         | userName | password   | confirmPassword | comments            | 
    | "BMW"    | "Moped"    | "300"       | "1200"     | "01/01/2021" | "3"       | "Yes"   | "Petrol" | "500"     | "4000"    | "30000"  | "123456789" | "2021"     | "Rafael"  | "Costa"  | "10/20/1989" | "M"    | "Rua das Roseiras" | "Brazil" | "11444110" | "Guaruja" | "Employee" | "Bungee" | "Skydiving" | "http://sampleapp.tricentis.com/101/app.php" | "12/03/2021" | "7.000.000,00" | "Bonus 8"   | "Full Coverage" | "Legal"          | "Yes"       | "Platinum"  | "teste@teste.com.br" | "11988888888" | "RFLSC"  | "Rc123456" | "Rc123456"      | "Teste Automations" | 
