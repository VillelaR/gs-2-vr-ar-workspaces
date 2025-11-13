# GS-2 VR/AR Workspaces

API Java para integração de Ambientes de trabalho com Realidade Virtual ou Aumentada

## Criando .jar

```
mvn clean package
```

- Localizar o .jar em /target

```
java -jar target/app.jar
```

## Executar a API

-  *Executando* **Maven**

```
mvn spring-boot:run
```

-  *Executando* **Maven Wrapper**

```
./mvnw spring-boot:run
```

-  *Instruções* **Docker Compose**

    -  https://devhints.io/docker-compose

```
docker compose up
docker compose stop
```

### Documentação da API (Swagger)
- http://localhost:8081/

## Membros do Grupo

- **Membro 1**: Nome do Membro 1
  - RM: 550275

- **Membro 2**: Nome do Membro 2
  - RM: 98007

## Tema Escolhido

**Ambientes de trabalho com Realidade Virtual ou Aumentada**

**Cálculo do tema:**
- RM1: 550275
- RM2: 98007
- Soma: 550275 + 98007 = 648282
- Último dígito: 2
- Tema selecionado: Tema 2

## Descrição do Tema

Esta API foi desenvolvida para suportar ambientes de trabalho inovadores que utilizam tecnologias de Realidade Virtual (VR) e Realidade Aumentada (AR). O objetivo é criar plataformas que permitam colaboração remota imersiva, reuniões virtuais em espaços 3D, treinamentos interativos e ambientes de trabalho híbridos que combinam elementos físicos e digitais. A solução visa transformar a forma como as equipes trabalham, oferecendo experiências mais envolventes e produtivas através de tecnologias imersivas.

## Finalidade da API

A API de integração para Ambientes de trabalho com Realidade Virtual ou Aumentada foi projetada para:

- Facilitar a integração entre sistemas de VR/AR e plataformas de trabalho colaborativo
- Fornecer endpoints para gerenciamento de ambientes virtuais de trabalho
- Suportar sincronização de dados entre ambientes físicos e virtuais
- Permitir a criação e gerenciamento de espaços de trabalho imersivos
- Oferecer APIs para integração com dispositivos de realidade aumentada e virtual

## Endpoints Disponíveis

### GET /api/v1/tema/info

Retorna informações sobre o tema do projeto, membros do grupo e descrição.

**Resposta:**
```json
{
  "tema": "Ambientes de trabalho com Realidade Virtual ou Aumentada",
  "membro1": "Nome do Membro 1",
  "membro2": "Nome do Membro 2",
  "descricao": "Descrição detalhada do tema..."
}
```

### GET /api/v1/tema/ping

Endpoint de health check.

**Resposta:**
```
Pong
```

### GET /api/v1/tema/version

Retorna a versão da API.

## Docker Hub

**URL da Imagem no Docker Hub:**
```
https://hub.docker.com/r/acnaweb/gs-2-vr-ar-workspaces
```

**Comando para pull:**
```bash
docker pull acnaweb/gs-2-vr-ar-workspaces:latest
```

## Workflows CI/CD

O projeto possui três workflows GitHub Actions configurados:

### 1. Versionamento (release-please.yml)

**Trigger:** Push na branch `main`

**Funcionalidades:**
- Gera tags automáticas usando release-please
- Cria releases automaticamente

### 2. Continuous Integration (ci.yaml)

**Trigger:** Push nas branches `feature/**`, `release`, `hotfix`

**Funcionalidades:**
- Compila a aplicação
- Executa testes unitários
- Constrói a imagem Docker para verificação

### 3. Continuous Delivery (cd.yaml)

**Trigger:** Pull Request para a branch `develop`

**Funcionalidades:**
- Compila e empacota a aplicação
- Constrói a imagem Docker
- Envia automaticamente a imagem para o Docker Hub

### Configuração de Secrets

**Workflow de Versionamento:**
- Usa automaticamente o `GITHUB_TOKEN` fornecido pelo GitHub Actions
- Não requer configuração adicional

**Workflow de CD (opcional):**
Para fazer push automático para Docker Hub, configure:

1. Acesse: Settings → Secrets and variables → Actions
2. Adicione:
   - **Variable**: `DOCKER_USER` (seu usuário do Docker Hub)
   - **Secret**: `DOCKER_TOKEN` (seu token do Docker Hub)
   
**Nota:** Se os secrets não estiverem configurados, o workflow ainda executará mas apenas fará build da imagem localmente para verificação.

## Referencias

- https://springdoc.org/
