#!/usr/bin/env bash
set -e

echo "== BUILD START =="

echo "Building application: ${APP_NAME}"
echo "Environment: ${ENVIRONMENT}"

# Simular compilación
mkdir -p target
echo "fake-binary-content" > target/app.bin

echo "Artifact generated at target/app.bin"

echo "== BUILD SUCCESS =="
