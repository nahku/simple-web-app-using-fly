For this lab we will use https://fly.io/

1. [Sign up for an account](https://fly.io/app/sign-up)

### install fly

First, check to see whether you have the "fly" CLI already installed.

If executing this:
```bash
flyctl
```
prints something like this (truncated here):
```
This is flyctl, the Fly.io command line interface.

Usage:
  flyctl [flags]
  flyctl [command]
...
```
then the "fly" CLI is already installed.

Otherwise:
```bash
brew install flyctl
```

### login to fly

```bash
fly auth login
```

### initial deployment to fly

```bash
fly launch
```

### deploy to fly

```bash
fly deploy
```

### debug running app

```bash
fly logs
```

### build docker image

```bash
docker build -t simple-web-app-using-fly .
```

### run docker container based on that image

```bash
docker run -p 8123:8123 simple-web-app-using-fly
```

Then view http://localhost:8123/

### cleanup

```bash
docker container prune -f
```

### CI/CD

from: https://fly.io/docs/app-guides/continuous-deployment-with-github-actions/

```bash
fly tokens create deploy -x 999999h
```