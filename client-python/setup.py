from setuptools import setup, find_packages

setup(
    name='client-python',
    version='0.1.0',
    description='My gRPC client module',
    author='Your Name',
    packages=find_packages(),
    install_requires=[
        'grpcio',
        'protobuf',
    ],
)
