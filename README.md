# cliente

Porta do serviço 8081

## API

### Clientes

```shell
curl --request POST \
  --url http://localhost:8081/clientes \
  --header 'Content-Type: application/json' \
  --data '{
	"nome":"Ana Luiza Sousa",
	"email":"apsousa10@gmail.com",
	"nascimento":"15-02-2000",
	"categoria":"BASIC"
}'
```