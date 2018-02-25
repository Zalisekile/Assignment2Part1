
public class ObjectEquality
{
    private int length;
    private int width;

    public ObjectEquality(int length, int width)
    {
        this.length = length;
        this.width = width;

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        if(obj == null)
        {
            return false;
        }
        if(getClass() != obj.getClass())
        {
            return false;
        }

        ObjectEquality otherRectangle = (ObjectEquality) obj;
        return (this.length == otherRectangle.length) && (this.width == otherRectangle.width);
    }



}
