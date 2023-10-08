# Banco de Dados Relacionais (SQL)
### Tópicos aprendidos:
* Introdução aos Banco de Dados Relacionais
    * Conceitos Básicos e Estrutura do Banco de Dados Relacional
    * Introdução e Conceitos Básicos de SQL
    * MER e DER: Modelagem de Banco de Dados
    * CRUD = <br> Create <br> Read <br> Update <br> Delete
* Modelagem de Dados Relacionais
    * Tabelas, Colunas e Registros
    * Operações CRUD (INSERT, SELECT, UPDATE e DELETE)
    * Chaves Primárias e Estrangeiras
    * ALTER TABLE
* Normalização de Dados
* Consultas Avançadas
    * INNER JOIN
    * LEFT JOIN
    * RIGHT JOIN
    * WHERE
    * COUNT
    * MAX
    * MIN
    * GROUP BY
    * ORDER BY

# Banco de Dados Não Relacionais (NoSQL)
* Introdução aos Banco de Dados NoSQL
    * Conceitos Básicos e Estrutura do Banco de Dados Não Relacional
    * Visão geral fos tipos de NoSQL
* Introdução ao MongoDB
    * Modelagem de dados usando documentos
    * Estrutura de modelagem de dados eficientes e escaláveis
    * [Formatador JSON](https://jsonformatter.curiousconcept.com/)
* Operações no MongoDB
    * use {{nome_do_banco}}
    * db.createCollection("{{nome_da_collection}}")
    * db.{{nome_da_collection}}.insertOne({})
    * db.{{nome_da_collection}}.insertMany([{}])
    * db.{{nome_da_collection}}.find({})
    * db.{{nome_da_collection}}.findOne({})
    * db.{{nome_da_collection}}.findOneAndUpdate({}, {})
    * db.{{nome_da_collection}}.updateOne({}, {$})
    * db.{{nome_da_collection}}.updateMany({}, {$})
        * Operadores de Update:
            1. $inc
            2. $push
            3. $set
            4. $unset
            5. $rename
    * db.{{nome_da_collection}}.findOneAndDelete({})
    * db.{{nome_da_collection}}.deleteOne({})
    * db.{{nome_da_collection}}.deleteMany({})
    * Consultas simples
        * Operadores Lógicos:
            1. $and
            2. $or
            3. $not
        * Operadores de Comparação:
            1. $eq: ==
            2. $ne: !=
            3. $gt: >
            4. $gte: >=
            5. $lt: <
            6. $lte: <=
            7. $in: []
            8. $nin: []
        * Paginação:
            * db.{{nome_da_collection}}.skip(N).limit(N)
* Breve apresentação ao Redis