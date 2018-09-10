
package revisao_ex02;

public class Elevador {
    private int terreo = 0;
    private int total_andares = 5;
    private int andar_atual = 0;
    private int capacidade = 5;
    private int qnt_atual = 0;
    
    public Elevador(){
        inicia(this.capacidade, this.total_andares);
    }
    
    public int getTerreo(){
        return terreo;
    }
    
    public void setTerreo(int terreo){
        this.terreo = terreo;
    }
    
    public int getTotal_andares(){
        return total_andares;
    }
    
    public void setTotal_andares(int total_andares){
        this.total_andares = total_andares;
    }
    
    public int getAndar_atual(){
        return andar_atual;
    }
    
    public void setAndar_atual(int andar_atual){
        this.andar_atual = andar_atual;
    }
    
    public int getCapacidade(){
        return capacidade;
    }
    
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    
    public int getQnt_atual(){
        return qnt_atual;
    }

    public void setQnt_atual(int qnt_atual){
        this.qnt_atual = qnt_atual;
    }
   
    
    public void inicia(int capacidade, int total_andares){
        andar_atual = terreo;
        qnt_atual = 0;
    }
    
    public void entra(){
        if(this.qnt_atual < this.capacidade){
            this.qnt_atual++;
        }else{
            System.out.println("Capacidade máxima atingida!");
        }
    }
    
    public void sai(){
        if(this.qnt_atual != 0){
            this.qnt_atual--;
        }else {
            System.out.println("O elevador esta vazio!");
        }
    }
    
    public void sobe(){
        if(this.andar_atual != this.total_andares){
            this.andar_atual++;
        } else{
            System.out.println("O elevador se encontra no último andar: " + getAndar_atual() + " °andar.");
        }
    }
    
    public void desce(){
        if(this.andar_atual != this.terreo){
            this.andar_atual--;
        } else{
            System.out.println("O elevador está no térreo!");
        }
    }
    
    
    
}
