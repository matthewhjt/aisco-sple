#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.rumahzakat --module-path aisco.product.rumahzakat -m aisco.product.rumahzakat &

wait