Idea:
Using Github events to notify about a newly created CVE / POC released on github.

Project looks like this atm
Github API --> Producer (With REST-API for Testing) --> [Kafka Topic: github-events] --> Consumer

TO DO:
Github API --> Kafka Producer --> Kafka Topic: github-events --> Flink (Filtering + Processing) --> Kafka Topic: cve-poc-events --> Alerting/Storage


- flink Kafka sink
- flink Kafka Source
- flink task?
- flink job?
- Grafana for visualization of kafka
- Frontend for showing alerts (Typescript / Angular)
