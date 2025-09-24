{ pkgs, ... }: {
  # Define o canal do Nix para pacotes estáveis.
  channel = "stable-23.11";

  # Pacotes necessários para o ambiente, incluindo o Java.
  packages = [
    pkgs.openjdk17
  ];

  # Configurações específicas para o IDX.
  idx = {
    # Extensões do VS Code a serem instaladas no ambiente.
    extensions = [
      "vscjava.vscode-java-pack"
    ];
  };
}
