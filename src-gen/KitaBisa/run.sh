#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.kitabisa --module-path aisco.product.kitabisa -m aisco.product.kitabisa &

wait