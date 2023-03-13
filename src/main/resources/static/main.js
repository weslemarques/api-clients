
const url = "http://localhost:8080/clients";

function getUsers() {
  let at = axios.get(url);
  console.log(at);
}

getUsers();