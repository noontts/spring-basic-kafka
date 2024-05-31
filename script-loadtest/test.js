import http from 'k6/http'
import { sleep } from 'k6';

export let options = {
  vus: 3500,
  duration: '5s'
}


export default function() {
  let sportsData = "The World War3 is coming!!!";
  let techData = "IPhone 28 is coming!!";
  let entertainmentData = "Horayyyyyyyyyy";

  let entertain_url = "http://localhost:8080/api/v1/create-news/entertainment";
  let tech_url = "http://localhost:8080/api/v1/create-news/tech";
  let sports_url = "http://localhost:8080/api/v1/create-news/sports";

  sleep(Math.random() * 2);
  http.post(entertain_url, entertainmentData, {
    headers: { 'Content-Type': 'text/plain' },
  });
  sleep(Math.random() * 2);

  http.post(tech_url, techData, {
    headers: { 'Content-Type': 'text/plain' },
  });
  sleep(Math.random() * 2);

  http.post(sports_url, sportsData, {
    headers: { 'Content-Type': 'text/plain' },
  });
}

