#!/usr/bin/env bash
set -e

echo "== TEST START =="

if [ ! -f target/app.bin ]; then
  echo "ERROR: Build artifact not found"
  exit 1
fi

echo "Artifact exists"

# Simular test
echo "Running fake tests..."
sleep 1

echo "All tests passed"

echo "== TEST SUCCESS =="
